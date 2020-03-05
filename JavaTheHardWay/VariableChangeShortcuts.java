import java.util.Scanner;

public class VariableChangeShortcuts {
  public static void main(String[] args) {

    int i, j, k;


    i = 5;
    j = 5;
    k = 5;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );

    i = i + 3;
    j = j - 3;
    k = k * 3;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

    i = 5;
    j = 5;
    k = 5;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
 /* compound assignment current value of i and add or subtract value*/
    i += 3;
    j -= 3;
    k *= 3;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

    i = j = k = 5;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );

    i += 1;
    j -= 2;
    k *= 3;
    System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );

    i =+ 1; //opertor error value set to positive 1
    j =- 2; //value set to negative 2
    System.out.println( "i: " + i + "\tj: " + j + "\n" );

    i = j = 5;
    System.out.println( "i: " + i + "\tj: " + j );

    i ++;
    j --;
    System.out.println( "i: " + i + "\tj: " + j );
    /* Add code that resets i's value to 5*/
    // i = 5;
    /* Add code using -= i's value to 0*/
    i -= 6;
    System.out.println( "i: " + i);

    /* Add code that resets i's value to 5*/
    i = 5;
    System.out.println( "i: " + i);
    i = 9;
    i ++ ;
    /* Add code using ++ i's value to 10*/
    System.out.println( "i: " + i);
  }


}
