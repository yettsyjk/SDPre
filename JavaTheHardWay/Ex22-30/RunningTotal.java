import java.util.Scanner;

public class RunningTotal{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    /*two variables to hold value just typed and a runningTotal*/
    int current, total;
    /*zero total value at first*/
    current = 1;
    total = 0;

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero");

    /*do while loop which runs at leastonce no matter what*/
    // do {
    /*rewrite to use a while loop*/
    while(current != 0) {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      /*add the value to stored value */
      total += current;
      /*display the runningTotal to see if current was zero, if not the loop repeats*/
      System.out.println("The running total is: "+ total);
      /*user types in zero and gets added to runningTotal and the condition is false*/
    } while (current != 0);
    System.out.println("The final total is:  "+ total);

  }
}
