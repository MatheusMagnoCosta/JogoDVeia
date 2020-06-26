import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestVitoria {
	private Jogo jogoTest = new Jogo();
	Tabuleiro tabuleiro = this.jogoTest.getTabuleiro();
	
	public void setPosicaoSituacao(int linha, int coluna) {
		tabuleiro.getPosicoes()[linha][coluna].setSimbolo('x');
		tabuleiro.getPosicoes()[linha][coluna].setSituacao(true);
	}
	
	/*Teste Horizontal*/
	@Test
	public void testVitoriaH1() {
		setPosicaoSituacao(0,0);
		setPosicaoSituacao(0,1);
		setPosicaoSituacao(0,2);
		Assert.assertEquals(jogoTest.checaLinhas(), true);
	}
	@Test
	public void testVitoriaH2() {
		setPosicaoSituacao(1,0);
		setPosicaoSituacao(1,1);
		setPosicaoSituacao(1,2);
		Assert.assertEquals(jogoTest.checaLinhas(), true);
	}
	@Test
	public void testVitoriaH3() {
		setPosicaoSituacao(2,0);
		setPosicaoSituacao(2,1);
		setPosicaoSituacao(2,2);
		Assert.assertEquals(jogoTest.checaLinhas(), true);
	}
	
	/*Teste vertical*/
	@Test
	public void testVitoriaV1() {
		setPosicaoSituacao(0,0);
		setPosicaoSituacao(1,0);
		setPosicaoSituacao(2,0);
		Assert.assertEquals(jogoTest.checaColunas(), true);
	}
	@Test
	public void testVitoriaV2() {
		setPosicaoSituacao(0,1);
		setPosicaoSituacao(1,1);
		setPosicaoSituacao(2,1);
		Assert.assertEquals(jogoTest.checaColunas(), true);
	}
	@Test
	public void testVitoriaV3() {
		setPosicaoSituacao(0,2);
		setPosicaoSituacao(1,2);
		setPosicaoSituacao(2,2);
		Assert.assertEquals(jogoTest.checaColunas(), true);
	}
	
	/*Teste Diagonal*/
	@Test
	public void testVitoriaD1() {
		setPosicaoSituacao(0,0);
		setPosicaoSituacao(1,1);
		setPosicaoSituacao(2,2);
		Assert.assertEquals(jogoTest.checaDiagonais(), true);
	}
	@Test
	public void testVitoriaD2() {
		setPosicaoSituacao(2,0);
		setPosicaoSituacao(1,1);
		setPosicaoSituacao(0,2);
		Assert.assertEquals(jogoTest.checaDiagonais(), true);
	}
	
	
}
