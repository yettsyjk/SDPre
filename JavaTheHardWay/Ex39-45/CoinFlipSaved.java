import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CoinFlipSaved {
  public static void main(String[] args ) throws Exception {
    Scanner kb = new Scanner(System.in);
    String coin, again, bestName, saveFileName = "coin-flip-score.txt";
    int streak = 0, best;
    boolean gotHeads;
/*create a File object with file name*/
    File f = new File(saveFileName);
    if( f.exists() && f.length() > 0 ) { /*if statement with conditional*/
      Scanner input = new Scanner(f);
        bestName = input.next();
        best = input.nextInt();
      input.close();
      System.out.print("High Score is "+ best);
      System.out.println( "flips in a row by"+ bestName );
    }
    else {
      System.out.println( "Save game file doesn't exist or is empty." );
      best = -1;
      bestName = "";

    }

    do {
      gotHeads = Math.random() < 0.5;

      if(gotHeads)
        coin = "HEADS";
      else
        coin = "TAILS";

      System.out.println("You flip a coin an it is .. "+ coin);

      if(gotHeads){
        streak++;
        System.out.println("\tThat's "+ streak + " in a row... ");
        System.out.print("\tWould you like to flip again (y/n)? ");
        again = kb.next();
    }
    else {
        System.out.println("\tYou lose everything!");
        System.out.println("\tShould've quit while you were aHEAD....");
        streak = 0;
        again = "n";
    }
  } while(again.equals("y"));
    System.out.println("Final score: " + streak);

    if( streak == best) {
      System.out.println("That's a new high score! ");
      System.out.println("Your name: ");
      bestName = kb.next();
      best = streak;
    }
    else if( streak == best ) {
      System.out.println("That's a new high score. Cool.");

    }
    else {
      System.out.print("You'll have to do better than ");
      System.out.println(streak + " if you want a high score. ");
    }
    /*save this name and high score to the file*/
    PrintWriter out = new PrintWriter(f);
      out.println(bestName);
      out.println(best);
    out.close();
  }

}
