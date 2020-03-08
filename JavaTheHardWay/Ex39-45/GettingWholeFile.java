import java.io.File;
import java.util.Scanner;

public class GettingWholeFile {
  public static void main(String [] args) throws Exception {
    int fourLetter;
    int caps = 0;
    /*files are stored in a string variable*/
    String fn1 = "some-words.txt";
    String fn2 = "GettingWholeFile.java";

    Scanner wordReadr = new Scanner(new File(fn1));
    /*.hasNext() returns true if Scanner stuff in it, it returns false if file is empty or if we already read it*/
    while( wordReadr.hasNext() ) {
    /*inside the body of the loop a single String into new local variable called w */
        String w = wordReadr.next();
      /* add to a counter if w is four characters long*/
        if( w.length() == 4 ) {
            fourLetter++;
        }
    }
    /*once the loop has completed we close it*/
    wordReadr.close();
/*create a second scanner object and attach it to read from second file*/
    Scanner selfInput = new Scanner(new File(fn2));
    while( selfInput.hasNext() ) {
        String token = selfInput.next();
      /*is the first letter of the current word by using token.charAt(0) zero index*/
      /* using .isUpper() is true when first letter is upper-case*/
        if( Character.isUpperCase(token.charAt(0) ) ) {
      /* counter increment by ine for characters in file that are uppper-case*/
            caps++;
          }
    }
    selfInput.close();

    System.out.println( fourLetter );
    System.out.println( caps );
  }
}
