import java.util.Scanner;

public class KeepGuessing {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    int secret, guess;

    secret = 1 + (int)(10*Math.random());

    System.out.println( "I have chosen a number between 1 and 10 " );
    System.out.println( "Try to guess it." );
    System.out.println( "Your guess: " );
    guess = keyboard.nextInt();

    while( secret != guess ){
      // System.out.println( "That is incorrect. Guess again. " );
      // System.out.print("Your guess: ");
      /*fix code so that it no longer containes an infinite loop */
      // guess = keyboard.nextInt();

      if (guess < secret){
        System.out.println("Too High. Guess again. ");
        guess = keyboard.nextInt();
      }
      if(guess > secret){
        System.out.println("Too low. guess again. ");
        guess = keyboard.nextInt();
      }
    }
    System.out.println( "That's right! You're a great guesser. " );


  }
}
