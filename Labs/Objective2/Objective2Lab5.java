public class Objective2Lab5 {
  public static void main(String[] args){
    double a, b, hypotenuse;

    a = 10.00;
    b = 8.00;
    hypotenuse = Math.sqrt((a+a)+(b*b));

    System.out.println(hypotenuse);
    System.out.println( "The hypotenuse of a triangle with side "+ a + " and side " + b + " is "+ hypotenuse );
    System.out.println();
  }
}
