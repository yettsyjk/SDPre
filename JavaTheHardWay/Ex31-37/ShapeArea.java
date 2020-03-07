import java.util.Scanner;

public class ShapeArea {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int choice;
    double area = 0;

    System.out.print("Shape Area Calculator version 0.1");
    System.out.println( "\n(c) 2020 LJtHW sample Output, Inc.");

    do {
      System.out.println( "\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" );
      System.out.println( "1) Triangle" );
      System.out.println( "2) Circle" );
      System.out.println( "3) Rectangle" );
      /*add a function to compute the area of a square and add it to the menu*/
      System.out.println( "4) Square" );
      System.out.println( "5) Quit" );
      System.out.println( "> " );
      choice = keyboard.nextInt();

    if( choice == 1 ){
      System.out.print("\nBase: ");
      int b = keyboard.nextInt();
      System.out.print("height: ");
      int h = keyboard.nextInt();
      area = computeTriangleArea(b, h);
      System.out.println("The are is base times height: " + area);
    }
      else if( choice == 2) {
        System.out.print("\nRadius: ");
        int radius = keyboard.nextInt();
        area = computeCircleArea(radius);
        System.out.println("The area is " + area);
      }
      else if( choice == 3) {
        System.out.print("\nRectangle Length: ");
        int q = keyboard.nextInt();
        System.out.print("Rectangle Width: ");
        int w = keyboard.nextInt();
        System.out.print("The area is length times width: "+ computeRectangleArea(q, w) );
      }
      else if( choice == 4) {
        System.out.print("\nSquare side length: ");
        int A = keyboard.nextInt();
        System.out.print("The area is length times length: "+ computeSquareArea(A) );
      }
      else if( choice != 5 ){
        System.out.print("ERROR.");
      }

    } while( choice != 5 );

    }
    public static double computeTriangleArea(int base, int height) {
      double A;
      A = 0.5 * base * height;
      return A;
    }

    public static double computeCircleArea(int radius) {
        double A;
        A = Math.PI * radius * radius;
        return A;
    }

    public static int computeRectangleArea(int length, int width) {
      return (length * width);
    }

    public static int computeSquareArea(int sideLength){
      return (sideLength * sideLength);
    }

}
