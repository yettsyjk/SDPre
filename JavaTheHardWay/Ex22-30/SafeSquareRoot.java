import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String userInput, again;


    System.out.print("Are you ready? (y or n)..it's ok I will wait.. ");
    userInput = keyboard.next();

    while(!userInput.equals(userInput));
      System.out.print("Are you ready? (y or n)..it's ok I will wait.. ");
      userInput = keyboard.next();
      
    }

    System.out.print( "Give me a number, and I'll find it's square root. " );
    System.out.print( "No negatives, please. " );
    x = keyboard.nextDouble();
    /*inout protection loop*/
    while(x < 0){
      System.out.println( "I won't take the square root of a negative. " );
      System.out.print( "\nNew number: " );
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println( "The square root of "+ x + " is "+ y );
  }
}
