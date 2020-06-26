import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestPosValida {

	private Jogo jogoTest = new Jogo();
	Tabuleiro tabuleiro = this.jogoTest.getTabuleiro();

	public void setJogada(int linha, int coluna, char simbolo) {
		tabuleiro.getPosicoes()[linha][coluna].setSimbolo(simbolo);
		tabuleiro.getPosicoes()[linha][coluna].setSituacao(true);
	}

	public boolean verificarJogada(int linha, int coluna, char simbolo) {
		if (tabuleiro.getPosicoes()[linha][coluna].getSituacao() == true) {
			return false;

		} else
			tabuleiro.getPosicoes()[linha][coluna].setSimbolo(simbolo);
		tabuleiro.getPosicoes()[linha][coluna].setSituacao(true);
		return true;
	}

	@Test
	public void testUnitValido1() {
		setJogada(0, 0, 'x');
		Assert.assertEquals(verificarJogada(0, 0, 'O'), false);
	}

	@Test
	public void testUnitValido2() {
		setJogada(0, 1, 'x');
		Assert.assertEquals(verificarJogada(0, 1, 'O'), false);
	}

	@Test
	public void testUnitValido3() {
		setJogada(0, 2, 'x');
		Assert.assertEquals(verificarJogada(0, 2, 'O'), false);
	}

	@Test
	public void testUnitValido4() {
		setJogada(1, 0, 'x');
		Assert.assertEquals(verificarJogada(1, 0, 'O'), false);
	}

	@Test
	public void testUnitValido5() {
		setJogada(1, 1, 'x');
		Assert.assertEquals(verificarJogada(1, 1, 'O'), false);
	}

	@Test
	public void testUnitValido6() {
		setJogada(1, 2, 'x');
		Assert.assertEquals(verificarJogada(1, 2, 'O'), false);
	}

	@Test
	public void testUnitValido7() {
		setJogada(2, 0, 'x');
		Assert.assertEquals(verificarJogada(2, 0, 'O'), false);
	}

	@Test
	public void testUnitValido8() {
		setJogada(2, 1, 'x');
		Assert.assertEquals(verificarJogada(2, 1, 'O'), false);
	}

	@Test
	public void testUnitValido9() {
		setJogada(2, 2, 'x');
		Assert.assertEquals(verificarJogada(2, 2, 'O'), false);
	}

}
