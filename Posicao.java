public class Posicao{

  private int linha;
  private int coluna;
  private boolean situacao;
  private char simbolo;
  
  public Posicao(int linha, int coluna){
    this.linha=linha;
    this.coluna=coluna;
    this.simbolo=' ';
  }

  public void setSimbolo(char simbolo){
    this.simbolo=simbolo;
  }

  public void setLinha(int linha){
    this.linha=linha;
  }

  public void setColuna(int coluna){
    this.coluna=coluna;
  }

  public void setSituacao(boolean situacao){
    this.situacao=situacao;
  }

  public int getLinha(){
    return (this.linha);
  }

  public int getColuna(){
    return (this.coluna);
  }

  public boolean getSituacao(){
    return (this.situacao);
  }

  public char getSimbolo(){
    return (this.simbolo);
  }
}
