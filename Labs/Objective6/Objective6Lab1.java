import java.util.Scanner;

public class Objective6Lab1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int counter;
    counter = 10;
    while(counter > 0 ){
      System.out.println(counter);
        // System.out.print( "Pick a number between 0 to 7 " );
        // counter = input.nextInt();
      /* this makes counter count downward*/
      counter = counter - 1;

    }

    input.close();
  }
}
