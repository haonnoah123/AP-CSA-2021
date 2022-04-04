
//makeWord(String s) --> creates the response listed on the documentation

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(makeWord("e komo mai"));
  /*  String s = "Y";
    Scanner keyboard = new Scanner(System.in);
    while (s.equals("Y") || s.equals("Yes")) {
      System.out.println("Enter a hawaiian word to pronounce");
      s = keyboard.nextLine();
      grossCode(s);
      System.out.println("Do you want to enter another word? Y/Yes/N/No");
     */// s = keyboard.nextLine();
   // }
  }

  public static void grossCode(String s) {
    s += " ";
    s = s.toLowerCase();
    System.out.println(makeWord(s));
  }

  public static String makeWord(String s) {
    s += " ";
    if(s.indexOf(' ') != s.length() - 1){
    s += " ";
    }
    s = s.toLowerCase();
    String p = "";
    ArrayList<Character> c = new ArrayList<>();
    int i = 0;
    c = toArrayList(s);
    if (c.get(0) == 'w') {
      p = p + "w";
      i++;
    }
    while (i < c.size() - 1) {
      if ((c.get(i + 1) == 'w')
          && (c.get(i) == 'a' || c.get(i) == 'i' || c.get(i) == 'e' || c.get(i) == 'u' || c.get(i) == 'o')) {
        p = p + weirdW(c, i);
        i += weirdW(c, i).length();
      } else if (c.get(i) == 'p' || c.get(i) == 'k' || c.get(i) == 'h' || c.get(i) == 'l' || c.get(i) == 'm'
          || c.get(i) == 'n') {
        p = p + consonants(c, i);
        i += consonants(c, i).length();
      } else if (c.get(i) == 'a' || c.get(i) == 'e' || c.get(i) == 'i' || c.get(i) == 'o' || c.get(i) == 'u') {
        p = p + vowel(c, i);
        if (vowel(c, i).equals("ah-")) {
          i += vowel(c, i).length() - 2;
        } else {
          i += vowel(c, i).length() - 1;
        }
      } else if (c.get(i) == '\'') {
        i++;
      } else if (c.get(i) == ' ') {
        p += " ";
        i++;
      } else {
        // return c.get(i) + " is not a valid hawaiian character";
        return "invalid";
      }
    }
    p = splitP(p, s);
    s = s.toUpperCase();
    if(s.substring(s.length() - 2, s.length()).equals("  ")){
      s = s.substring(0, s.length() - 1);
      p = p.substring(0, p.length() - 1);
    }
    return s + "is pronounced " + p;
  }

  public static String splitP(String p, String s) {
    String p2 = "";
    int n = s.indexOf('\'');
    for (int i = 0; i < p.length() - 1; i++) {
      if (isVowel(p.charAt(i))) {
        p2 += p.substring(i, i + 2) + "-";
        i++;
      } else {
        p2 += p.substring(i, i + 1);
      }

    }
    if (n > -1) {
      n = p2.length() - s.length() + n;
      p2 = p2.substring(0, n - 1) + "\'" + p2.substring(n);
    }
    for (int i = 0; i < p2.length() - 3; i++) {
      if (p2.substring(i, i + 2).equals("- ")) {
        p2 = p2.substring(0, i) + " " + p2.substring(i + 2);
      }
      if (p2.substring(i, i + 1).equals("-") && isVowel(p2.charAt(i + 1)) && p2.substring(i + 2, i + 3).equals(" ")) {
        p2 = p2.substring(0, i) + p2.substring(i + 1);
      }
    }

    p2 = p2.substring(0, 1).toUpperCase() + p2.substring(1, p2.length() - 1);
    return p2;
  }

  public static boolean isVowel(char c) {
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
  }

  public static ArrayList<Character> toArrayList(String s) {
    ArrayList<Character> c = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      c.add(s.charAt(i));
    }

    return c;
  }

  public static String weirdW(ArrayList<Character> c, int i) {
    String p = "";
    if (c.get(i) == 'a' && c.get(i + 1) == 'w') {
      p = p + "w";
    } else if ((c.get(i) == 'i' || c.get(i) == 'e') && c.get(i + 1) == 'w') {
      p = p + "v";
    } else if ((c.get(i) == 'u' || c.get(i) == 'o') && c.get(i + 1) == 'w') {
      p = p + "w";
    }
    return p;
  }

  public static String vowel(ArrayList<Character> c, int i) {
    String p = "";
    if (c.get(i) == 'a' && (c.get(i + 1) == 'i' || c.get(i + 1) == 'e')) {
      p = p + "eye";
    } else if (c.get(i) == 'a' && c.get(i + 1) == 'o') {
      p = p + "ow";
    } else if (c.get(i) == 'a' && c.get(i + 1) == 'u') {
      p = p + "oo";
    } else if (c.get(i) == 'e' && c.get(i + 1) == 'i') {
      p = p + "ay";
    } else if (c.get(i) == 'e' && c.get(i + 1) == 'u') {
      p = p + "eh-oo";
    } else if (c.get(i) == 'i' && c.get(i + 1) == 'u') {
      p = p + "ew";
    } else if (c.get(i) == 'o' && c.get(i + 1) == 'i') {
      p = p + "oy";
    } else if (c.get(i) == 'o' && c.get(i + 1) == 'u') {
      p = p + "ow";
    } else if (c.get(i) == 'u' && c.get(i + 1) == 'i') {
      p = p + "ooey";
    } else if (c.get(i) == 'a') {
      p = p + "ah";
    } else if (c.get(i) == 'e') {
      p = p + "eh";
    } else if (c.get(i) == 'i') {
      p = p + "ee";
    } else if (c.get(i) == 'o') {
      p = p + "oh";
    } else if (c.get(i) == 'u') {
      p = p + "oo";
    }
    return p;
  }

  public static String consonants(ArrayList<Character> c, int i) {
    String p = "";
    if (c.get(i) == 'p' || c.get(i) == 'k' || c.get(i) == 'h' || c.get(i) == 'l' || c.get(i) == 'm'
        || c.get(i) == 'n') {
      p = p + c.get(i);
    }
    return p;
  }
}
