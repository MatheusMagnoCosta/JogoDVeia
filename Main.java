import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("##############################");
		System.out.println("##############################");
		System.out.println("#Jogador 1: Seu símbolo é 'X'#");
		System.out.println("#Jogador 2: Seu símbolo é 'O'#");
		System.out.println("##############################");
		System.out.println("##############################");
		System.out.println("\n");
		System.out.println("\n");
		jogo.getTabuleiro().printaTabuleiro();

		int vez = 1;
		int linha;
		int coluna;
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
					jogo.getTabuleiro().printaTabuleiro();
					if (jogo.checaJogo() == true) {
						{
							if (jogo.checaEmpate() == true) {
								System.out.println("Empate! Ninguém ganhou :/");
								System.out.println("\n");
							} else {
								System.out.println("O player " + vez + " ganhou!");
								System.out.println("Não fique triste player ");
								System.out.println("\n");
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
}
