import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
class Main {

  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>();
    words = importFile("en.txt");
    String word = randomWord(words);
    int r = (int)(Math.random() * 10 + 1);
    Hangman game = new Hangman(word, r);
    game.play();
  }

  public static String randomWord(ArrayList<String> words){
    int r = (int)(Math.random() * words.size());
    return words.get(r);
  }

  public static ArrayList<String> importFile(String fileName) {
    ArrayList<String> words = new ArrayList<>();
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        words.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return words;
  }
}
