import java.util.Scanner;

public class Objective4Lab4 {
  /* create a main method */
  public static void main(String[] args){
    /* create a scanner */
    Scanner input = new Scanner(System.in);
    /* create a scanner */
    int userNum;
    /* determine if userNum is odd or even*/
    System.out.print( "Please enter a number: " );
    userNum = input.nextInt();

    if (userNum % 2 == 0 || userNum == 0){
      System.out.println( userNum + " is an even number." );
    } else {
      System.out.println( userNum + " is an odd number." );
    }

    input.close();
  }
}
