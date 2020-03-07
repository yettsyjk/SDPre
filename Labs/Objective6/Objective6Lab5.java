import java.util.Scanner;

public class Objective6Lab5 {
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    int selection;

    while(true){
      System.out.println("______Menu______");
      System.out.println("1: Say Hello ");
      System.out.println("2: List My favorite foods ");
      System.out.println("3: Exit ");

      System.out.println();

      selection = scanner.nextInt();
      /*inside endless loop write if statment determines 1, 2, or 3 was selected*/
      if(selection == 1 )
      /*if 1 is pressed print Hello World*/
        System.out.println("Hello World");
      }
        else if(selection == 2) {
          /*if 2 was pressed print a string of fav foods provided*/
          System.out.println("Apple, Banana, Coconut");
      }
        else if(selection == 3) {
          /*if 3 was pressed break the loop or it will be an infinite loop*/
          System.out.println("exit");
          break;
      }
        else {
          System.out.println("Great choice");
          scanner.close();
        }
      }

    }
  }
