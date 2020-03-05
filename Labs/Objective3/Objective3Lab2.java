import java.util.Scanner;

public class Objective3Lab2 {
  public static void main(String[] args){
    String name;

    Scanner input = new Scanner(System.in);

    System.out.print( "What is your Name? " );
    name = input.next();

    System.out.println("Hello "+ name);

    input.close();
  }
}
