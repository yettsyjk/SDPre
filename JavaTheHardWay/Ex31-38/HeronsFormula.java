public class HeronsFormula {
  public static void main (String[] args){
    double a, g;
    String tws = "A triangle with sides ";
    /* triangleArea has three parameters, all integers*/
    a = triangleArea(3, 3, 3);
    System.out.println( "A triangle with sides 3,3,3 has area "+ a );

    a = triangleArea(3, 4, 5);
    System.out.println( "A triangle with sides 3,4,5 has area "+ a );
    g = triangleArea(7, 8, 9);
    System.out.println( tws + "7,8,9 has area "+ g );

    System.out.println( tws + "5,12,13 has area "+ triangleArea(5, 12, 13) );
    System.out.println( tws + "10,9,11 has area "+ triangleArea(10, 9, 11) );
    System.out.println( tws + "8,15,17 has area "+ triangleArea(8, 15, 17) );
    /*find the area of triangle with sides 9,9,9*/
    /*utilizing function available allows easier way to enter new code calculation*/
    System.out.println(tws + "9,9,9 has area "+ triangleArea(9, 9, 9));
  }
  /*function computes area of a triangle with side lengths a, b, & c */
  public static double triangleArea(int a, int b, int c){ /*double means function returns a value and type of value id double*/
    double s, A;
/*functions allow code to be more efficient and code to be DRY */
/*update 2 to 2.0 to correct issues with */
    s = (a+b+c) /2.0;
    A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
    // System.out.println(A);
    /* after computing the area, you must return the computed value. triangleArea functions returns value  */
    return A;


  }
}
