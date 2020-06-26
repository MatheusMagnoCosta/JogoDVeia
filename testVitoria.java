import org.junit.Assert;
import org.junit.jupiter.api.Test;

class testVitoria {
	private Jogo jogoTest;
	
	@Test
	public void test1() {
		Tabuleiro tabuleiro = this.jogoTest.getTabuleiro();
		tabuleiro.getPosicoes()[0][0].setSimbolo('x');
		tabuleiro.getPosicoes()[0][0].setSituacao(true);
		char teste = tabuleiro.getElemento(0, 0);
		Assert.assertEquals(teste, 'x');
	}

}
