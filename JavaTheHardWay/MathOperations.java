public class MathOperations {
  public static void main (String[] args){
    int a, b, c, d, e, f, g, h;
    double w, x, y, z;
    String one, two, both, average;

    a = 10;
    b = 27;
    System.out.println( "a is "+ a + ", b is "+ b );

    c = a + b;
    System.out.println( "a + b is "+ c );

    d = a - b;
    System.out.println( "a - b is "+ d );

    e = a + b *3;
    System.out.println( "a+b*3 is "+ e );

    f = b / 2;
    System.out.println( "b/2 is "+ f );

    g = b % 10;
    System.out.println( "b%10 is "+ g );


    x = 1.1;//1.1 is a repeating decimal binary limited precision
    System.out.println( "/nx is "+ x );

    y = x*x;
    System.out.println( "x*x is "+ y );

    z = b /2;
    System.out.println( "b/2 is "+ z );
    System.out.println();

    one = "dog";
    two = "house";
    both = one + two;
    System.out.println( both );

/* My variables */
    h = a % 2;
    System.out.println( "a % 2 is "+ h );

    w = x* y;
    System.out.println(" x * y is "+ w);

    average = "sandstorm";
    System.out.println("What a weird "+ average + " in this "+ both);
  }
}
