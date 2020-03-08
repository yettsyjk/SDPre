import java.util.Scanner;

public class BMICategories{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double m, kg, pounds, inches, bmi;

    System.out.print( "Your height in inches is: " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight is: " );
    pounds = keyboard.nextDouble();

    m = inches/39.370;
    kg = pounds/2.2046;
    bmi = kg / (m*m);
    System.out.println( "You BMI is "+ bmi );

    // System.out.print( "Enter your BMI: " );
    // bmi = keyboard.nextDouble();

    System.out.print( "BMI category: " );
    if( bmi < 15.0 ) {
      System.out.println( "very severely underweight " );
    }
    else if( bmi <= 16.0 ) {
      System.out.println( "severely underweight " );
    }
    else if( bmi < 18.5 ) {
      System.out.println( "underweight " );
    }
    else if( bmi < 25.0 ) {
      System.out.println( "normal weight " );
    }
    else if( bmi < 30.0 ) {
      System.out.println( "overweight " );
    }
    else if( bmi < 35.0 ) {
      System.out.println( "moderately obese " );
    }
    else if( bmi < 40.0 ) {
      System.out.println( "severely obese " );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
