import java.util.*;

public class Hangman {
  // the secret word
  private String word;

  // a string that shows which letters in word have and have not been guessed yet
  private String hint;

  // how many guesses the player has left
  private int numGuessesLeft;

  public Hangman(String secret, int numGuesses) {
    word = secret;
    numGuessesLeft = numGuesses;

    initHint();
  }

  /**
   * Initialize the hint instance variable so that it contains a ? for each letter
   * in word. If word is "hello" then hint should be "?????"
   */
  public void initHint() {
    hint = "";
    for (int i = 0; i < word.length(); i++) {
      hint = hint + "?";
    }
  }

  /**
   * Checks if word contains letter. If it does, return true; otherwise, decrement
   * numGuessesLeft by 1 and return false. Precondition: letter contains exactly 1
   * character
   */
  public boolean checkGuess(String letter) {
    for (int i = 0; i < word.length() - 1; i++) {
      if (letter.equals(word.substring(i, i + 1))) {
        return true;
      }
    }
    return false;
  }

  /**
   * Replace the character in hint at the specified index with letter.
   * Precondition: letter contains exactly 1 character and 0 <= index <
   * word.length()
   */
  public void replaceHintLetter(int index, String letter) {
    hint = hint.substring(0, index) + letter + hint.substring(index + 1);
  }

  /**
   * Replace each ? in hint with letter at aech index that letter exists in word.
   * For example, if word is "tomato" then updateHint("o") would change hint to be
   * "?o???o" Precondition: letter contains exactly 1 character.
   */
  public void updateHint(String letter) {
    char a = letter.charAt(0);
    for(int i = 0; i < word.length(); i++){
      if(word.charAt(i) == a){
        replaceHintLetter(i, letter);
      }
    }
  }

  /**
   * Return true if all the letters of word have been guessed correctly or if
   * there are no more guesses left; otherwise, return false.
   */
  public boolean isGameOver() {
    if (hint.equals(word)) {
      return true;
    } else if (numGuessesLeft == 0) {
      return true;
    } else {
      return false;
    }  
  }

  /**
   * Ask the user to guess a letter until the game ends. After the game ends, tell
   * the user if they won or lost.
   */
  public void play() {
    Scanner in = new Scanner(System.in);
    while (!isGameOver()) {
      System.out.println("Guesses Left: " + numGuessesLeft);
      System.out.println("Hint: " + hint);
      String guess = in.next(); // read input from user
      // make sure guess has at least 1 character
      if (guess.length() > 0) {
        guess = guess.substring(0, 1); // make sure guess contains exactly 1 character
        if (checkGuess(guess)) {
          updateHint(guess);
        } else {
          numGuessesLeft--;
        }
      }

    }

    if (numGuessesLeft <= 0) {
      System.out.println("Guesses Left: " + numGuessesLeft);
      System.out.println("You lose...");
    } else {
      System.out.println(hint);
      System.out.println("You win!");
    }
  }

}
