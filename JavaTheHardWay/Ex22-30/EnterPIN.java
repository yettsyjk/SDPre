import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String passCode, typedPassword;

    pin = 12345;
    typedPassword = "spaceballs";
    /* ask for password prior to pin, should be a string */

    System.out.println( "WELCOME TO THE BANK OF JAVA." );
    System.out.println("ENTER YOUR PASSWORD: ");
    passCode = keyboard.next();

    /*using a string method of .equals() typedPassword is the opposite of actual password user notified incorrect */
    while( !passCode.equals(typedPassword.toLowerCase())) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN");
      System.out.print("ENTER YOUR PASSWORD: ");
      passCode = keyboard.next();
    }

    System.out.print( "ENTER YOUR PIN: " );
    entry = keyboard.nextInt();

    while( entry != pin ){
      System.out.println("\nINCORRECT PIN. TRY AGAIN");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
     }
     System.out.println("\nPIN ACCEPTED. \nYOUR ACCOUNT BALANCE IS $425.17");
  }
}
