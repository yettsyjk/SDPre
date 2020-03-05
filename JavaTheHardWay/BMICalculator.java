import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args){
    /* System.in is inputStream connected to keyboard input*/
    Scanner keyboard = new Scanner(System.in);

    double m, kg, pounds, feet, inches, bmi;
    /* System.out is a printStream write characters*/
    // System.out.print( "Your height is m: ");
    // m = keyboard.nextDouble();

    // System.out.print( "Your weight is kg: " );
    /* user input requires a numeric value, errors out when user enter alpha due to double*/
    // kg = keyboard.nextDouble();

    // bmi = kg / (m*m);

    /* Questions */
    System.out.print( "Your height in feet is: ");
    /* user input requires a numeric value, errors out when user enter alpha due to double*/
    feet = keyboard.nextDouble();

    System.out.print( "Your height in inches is: " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds is: " );
    pounds = keyboard.nextDouble();

    /* convert inches to meters*/
    m = inches/39.370;
    kg = pounds/2.2046;
    bmi = kg / (m*m);


    System.out.println( "Your BMI is " + bmi );
  }
}
