public class Crossword {

  private Square[][] puzzle;


 public Crossword(boolean[][] blackSquares)
 { 
   /* to be implemented in part (b) */ 
  int temp = 1;
   puzzle = new Square[blackSquares.length][blackSquares[0].length];
   for ( int r = 0 ; r<blackSquares.length; r++ ) {
     for ( int c= 0; c<blackSquares[0].length; c++) {
  if (toBeLabeled(r,c,blackSquares)){
    puzzle[r][c] = new Square(false, temp);
    temp++;
  } else {
    puzzle[r][c] = new Square(blackSquares[r][c],0);
  }
     }
   }

 }
  /*
   * check if it should be toBeLabeled if it is, put the proper number make it
   * black or white if necessary
   */

  // a
  private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
    if (!blackSquares[r][c]) {
      if (r == 0 || c == 0|| blackSquares[r - 1][c] || blackSquares[r - 0][c - 1]) {
        return true;
      }
  }
   return false;

  }

  public String getPuzzle() {
    String str = "";
    for (int r = 0; r < puzzle.length; r++) {
      for (int c = 0; c < puzzle[r].length; c++) {
        if (puzzle[r][c].isBlack()) {
          str += "XX";
        } else {
          if (puzzle[r][c].getNum() > 0) {
            if (puzzle[r][c].getNum() < 10) {
              str += "0";
            }
            str += puzzle[r][c].getNum();
          } else {
            str += "__";
          }
        }
      }
      str += "\n";
    }
    return str;
  }
}
