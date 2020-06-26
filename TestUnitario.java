import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestUnitario {

	private Jogo jogoTest = new Jogo();
	Tabuleiro tabuleiro = this.jogoTest.getTabuleiro();

	public char setJogada(int linha, int coluna, char simbolo) {
		tabuleiro.getPosicoes()[linha][coluna].setSimbolo(simbolo);
		tabuleiro.getPosicoes()[linha][coluna].setSituacao(true);
		return tabuleiro.getElemento(linha, coluna);
	}

	@Test
	public void testUnit1() {
		Assert.assertEquals(setJogada(0, 0, 'x'), 'x');
	}

	@Test
	public void testUnit2() {
		Assert.assertEquals(setJogada(0, 1, 'x'), 'x');
	}

	@Test
	public void testUnit3() {
		Assert.assertEquals(setJogada(0, 2, 'x'), 'x');
	}

	@Test
	public void testUnit4() {
		Assert.assertEquals(setJogada(1, 0, 'x'), 'x');
	}

	@Test
	public void testUnit5() {
		Assert.assertEquals(setJogada(1, 1, 'x'), 'x');
	}

	@Test
	public void testUnit6() {
		Assert.assertEquals(setJogada(1, 2, 'x'), 'x');
	}

	@Test
	public void testUnit7() {
		Assert.assertEquals(setJogada(2, 0, 'x'), 'x');
	}

	@Test
	public void testUnit8() {
		Assert.assertEquals(setJogada(2, 1, 'x'), 'x');
	}

	@Test
	public void testUnit9() {
		Assert.assertEquals(setJogada(2, 2, 'x'), 'x');
	}
}
