public class Player{

  private char simbolo;
  private static int player = 0;

  public Player(){
    if (player==0){
      simbolo = ('x');
    }
    else{
      simbolo = ('O');
    }
    player++;
  }

  public char getSimbolo(){
    return simbolo;
  }
}
