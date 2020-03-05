import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    currentYear = 2020;

    Scanner input = new Scanner(System.in);

    System.out.println( "How old are you? " );
    /* calc age of user*/
    age = input.nextInt();
    birthYear = 2020-age;



    // System.out.println( birthYear);
    System.out.println("You were born in : " + birthYear);
    input.close();
  }
}
