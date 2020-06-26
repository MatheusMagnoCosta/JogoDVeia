import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestEmpate {
	private Jogo jogoTest = new Jogo();
	Tabuleiro tabuleiro = this.jogoTest.getTabuleiro();

	public void setPosicaoSituacao(int linha, int coluna, char simbolo) {
		tabuleiro.getPosicoes()[linha][coluna].setSimbolo(simbolo);
		tabuleiro.getPosicoes()[linha][coluna].setSituacao(true);
	}
	@Test
	public void testEmpate() {
		setPosicaoSituacao(0, 1, 'x');
		setPosicaoSituacao(0, 0, 'O');
		setPosicaoSituacao(1, 0, 'x');
		setPosicaoSituacao(0, 2, 'O');
		setPosicaoSituacao(2, 2, 'x');
		setPosicaoSituacao(1, 2, 'O');
		setPosicaoSituacao(2, 0, 'x');
		setPosicaoSituacao(2, 1, 'x');
		setPosicaoSituacao(1, 1, 'x');
		Assert.assertEquals(jogoTest.checaEmpate(), true);
	}
}
