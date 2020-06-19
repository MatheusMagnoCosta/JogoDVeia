
public class Verificador extends Jogo {

	public boolean valorJogado(int linha, int coluna) {
		if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checaColunas() {
		int i = 0;
		for (int j = 0; j < tabuleiro.getTamanhoColunas(); j++) {
			if (tabuleiro.getPosicoes()[i][j].getSituacao() == true) {
				if ((tabuleiro.getPosicoes()[i][j].getSimbolo() == tabuleiro.getPosicoes()[i + 1][j].getSimbolo())
						&& (tabuleiro.getPosicoes()[i][j].getSimbolo() == tabuleiro.getPosicoes()[i + 2][j]
								.getSimbolo()))
					return (true);
			}
		}
		return (false);
	}

	public boolean checaLinhas() {
		int j = 0;
		for (int i = 0; i < tabuleiro.getTamanhoLinhas(); i++) {
			if (tabuleiro.getPosicoes()[i][j].getSituacao() == true) {
				if ((tabuleiro.getPosicoes()[i][j].getSimbolo() == tabuleiro.getPosicoes()[i][j + 1].getSimbolo())
						&& (tabuleiro.getPosicoes()[i][j + 1].getSimbolo() == tabuleiro.getPosicoes()[i][j + 2]
								.getSimbolo()))
					return (true);
			}
		}
		return (false);
	}

	public boolean checaDiagonais() {
		int j = 0;
		int i = 0;
		if (tabuleiro.getPosicoes()[i + 1][j + 1].getSituacao() == true) {
			if (((tabuleiro.getPosicoes()[i][j].getSimbolo() == tabuleiro.getPosicoes()[i + 1][j + 1].getSimbolo())
					&& (tabuleiro.getPosicoes()[i][j].getSimbolo() == tabuleiro.getPosicoes()[i + 2][j + 2]
							.getSimbolo()))
					|| ((tabuleiro.getPosicoes()[i + 1][j + 1].getSimbolo() == tabuleiro.getPosicoes()[i + 2][j]
							.getSimbolo())
							&& (tabuleiro.getPosicoes()[i + 1][j + 1].getSimbolo() == tabuleiro.getPosicoes()[i][j + 2]
									.getSimbolo())))
				return (true);
		}
		return (false);
	}

	public boolean checaEmpate() {
		int cont = 0;
		for (int i = 0; i < (getTabuleiro().getTamanhoLinhas()); i++) {
			for (int j = 0; j < (getTabuleiro().getTamanhoColunas()); j++) {
				if (tabuleiro.getPosicoes()[i][j].getSituacao() == true)
					cont++;
			}
		}
		if (cont == 9)
			return (true);
		else
			return (false);
	}

	public boolean checaJogo() {
		if (checaLinhas() == true | checaColunas() == true | checaDiagonais() == true | checaEmpate() == true)
			return (true);
		else
			return (false);
	}

}
