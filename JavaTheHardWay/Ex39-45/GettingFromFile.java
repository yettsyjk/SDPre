import java.io.File;
import java.util.Scanner;

public class GettingFromFile {
  public static void main(String[] args) throws Exception {
    String name;
    int a, b, c, sum;

    System.out.print( "Getting name and three numbers from file.." );
    Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));
    name = fileIn.nextLine();/*pausing the prgram and reads in string from Scanner object*/
    a = fileIn.nextInt(); /*fileIn object awaits for integer input*/
    b = fileIn.nextInt();
    c = fileIn.nextInt();
    fileIn.close();

    System.out.println( "done." );
    System.out.println( "Your name is "+ name );
    sum = a + b+ c;
    System.out.println( a+ "+"+ b+ "+"+c + "=" + sum);




  }
}
