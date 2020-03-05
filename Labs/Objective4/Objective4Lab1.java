import java.util.Scanner;

public class Objective4Lab1{
  public static void main(String[] args){
    int num1, num2;

    num1 = 5;
    num2 = 15;

    System.out.print( "Let's see which number is greater: " );
    System.out.println();
    /* code */
    if( num1 > num2 ) {

      /* */
      System.out.println( num1 + " is greater than "+ num2 );

    } else if(num2 > num1) {
      /* */
      System.out.println( num2 + " is greater than "+ num1 );
    }
  }
}
