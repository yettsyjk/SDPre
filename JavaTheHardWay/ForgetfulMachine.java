import java.util.Scanner;
/*keyboard and files libraries avialable */
public class ForgetfulMachine {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    /*Keyboard run your next function with actual correct answer not required*/
    System.out.println( "What city is the capital of France?" );
    keyboard.next();

/*nextInt function pauses the program and waits for actual input */
    System.out.println( "What is 6 multiplied by 7?" );
    keyboard.nextInt();
/*if user doesn't have actual input, user must control out of the program*/
    System.out.println( "Enter a number between 0.0 and 1.0" );
    keyboard.nextDouble();

    System.out.println( "Do you enjoy Java so far?" );
    keyboard.next();

    /* Program requires an input or user will have to control c to quit program*/
  }
}
