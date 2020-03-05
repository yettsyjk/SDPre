import java.util.Scanner;

public class Objective5Lab1 {
  public static void main (String[] arg){
    Scanner keyboard = new Scanner(System.in);

    int month, days;
    String monthName;

    month = 6;
    System.out.print( "Enter a month from 1 to 6: ");
    month = keyboard.nextInt();

    switch (month) {
      case 1: monthName = "January";
        System.out.println( "January" );
        break;
      case 2: monthName = "February";
        System.out.println( "February" );
        break;
      case 3: monthName = "March";
        System.out.println( "March" );
        break;
      case 4: monthName = "April";
        System.out.println( "April" );
        break;
      case 5: monthName = "May";
        System.out.println( "May" );
        break;
      case 6: monthName = "June";
        System.out.println( "June" );
        break;
      default: monthName = "error";
      System.out.println( "That is not a valid month" );
      break;

      
    }
  }
}
