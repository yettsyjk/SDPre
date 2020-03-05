import java.util.Scanner;

public class Objective4Lab3 {
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    int userNum;

    System.out.print( "Please enter a number: ");
    userNum = scanner.nextInt();
    /* */
    if(userNum >= 0 || userNum == 0) {
      System.out.println( userNum + " is a positive number." );
    }else {
      System.out.println( userNum+ " is a negative number. " );
    }


    scanner.close();
  }

}
