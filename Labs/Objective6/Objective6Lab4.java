import java.util.Scanner;
/*create a class structure */
public class Objective6Lab4 {
  /*create a main method*/
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
/*create two variables tp store sum total and counter */
    int sum, count;
    sum = 0;
    count = 0;
    /*write a while loop*/
    while(count <= 20){
      System.out.println( count + ": sum is equivalent to count plus sum " );
      sum = count + sum;
      count = count +1;
    }

    System.out.println( sum );
  }

}
