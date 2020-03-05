import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args){
    int num1, num2, total;

    Scanner input = new Scanner(System.in);

    System.out.print( "Please enter a number: " );
    num1 = input.nextInt();

    System.out.print( "Please enter another number: " );
    num2 = input.nextInt();

    total = num1 + num2;

    System.out.print( "The sum of "+ num1+ " + "+ num2+ " = "+ total );
    System.out.println();

    input.close();
  }
}
