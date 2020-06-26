import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("##############################");
		System.out.println("##############################");
		System.out.println("#Jogador 1: Seu símbolo é 'X'#");
		System.out.println("#Jogador 2: Seu símbolo é 'O'#");
		System.out.println("##############################");
		System.out.println("##############################");
		System.out.println("\n");
		iniciarJogo();
	}

	private static void iniciarJogo(){
		Jogo jogo = new Jogo();
		jogo.getTabuleiro().printaTabuleiro();
		Historico historico = new Historico();
		String jogada = " ";
			int vez = 1;
			int linha;
			int coluna;
			int numJogadas = 0;
			boolean jogou = true;
			
			while (true) {
				System.out.println("Vez do Player " + vez + ": " + jogo.getJogador(vez).getSimbolo());
				String jogadas = scanner.nextLine();
				String arrayy[] = new String[2];
				arrayy[0] = null;
				arrayy[1] = null;
				arrayy = jogadas.split(",");
				try {
					linha = Integer.valueOf(arrayy[0]);
					coluna = Integer.valueOf(arrayy[1]);
					if (jogo.valorJogado(linha, coluna) == true) {
						jogou = jogo.Jogar(linha, coluna, jogo.getJogador(vez).getSimbolo());
						numJogadas++;
						String jogadasPos = vezPlayer(vez) + numJogadas;
						jogada = linha + ", " + coluna;
						
						historico.addJogada(vezPlayer(vez),jogada,jogadasPos);
						jogo.getTabuleiro().printaTabuleiro();
						if (jogo.checaJogo() == true) {
							{
								if (jogo.checaEmpate() == true) {
									historico.mostrarJogadas();
									System.out.println("------------------");
									System.out.println("Empate! Ninguém ganhou :/");
									System.out.println("\n");
									reiniciarJogo();
								} else {
									historico.mostrarJogadas();
									System.out.println("------------------");
									System.out.println("O player " + vez + " ganhou!");
									System.out.println("Não fique triste player ");
									System.out.println("\n");
									reiniciarJogo();
								}
								break;
							}
						}
						if (jogou == true) {
							if (vez % 2 == 0)
								vez--;
							else
								vez++;
						}else {
							System.out.println("Tente Novamente");
							System.out.println("\n");
						}
					} else {
						System.out.println("JOGADA INVÁLIDA!!");
						System.out.println("Valores válidos de 0 a 2");
						System.out.println("Tente Novamente");
						System.out.println("\n");
						jogou = false;
					}
				} catch (Exception ex) {
					System.out.println("Faça a jogada de dois números separados por virgulas");
					System.out.println("Linha,Coluna");
					System.out.println("Ex: 2,1");
					jogou = false;
					
				}
			}
			scanner.close();
	}

	private static String vezPlayer(int vez) {
		String vezPlayer = "Player " + vez + ": ";
		return vezPlayer;
	}
	
	private static void reiniciarJogo() {
		System.out.println("Quer Reiniciar o jogo?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		String resposta = scanner.nextLine();
		switch(resposta){
		case "1":
			iniciarJogo();
		case "2":
			break;
		default:
			break;
		}
		
	}
}
