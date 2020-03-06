public class RandomNumbers {
  public static void main(String[] args){
    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    /* will be true 1/3 of the time*/
    if(rps < 0.3333333) {
      System.out.println( "ROCK" );
    } else if(rps < 0.6666667){
      System.out.println( "PAPER" );

    } else {
      System.out.println( "SCISSORS" );
    }
    /* pick four random integers each 1-10 */
    a = 1 + (int)(10*Math.random());
    b = 1 + (int)(10*Math.random());
    c = 1 + (int)(10*Math.random());
    d = 1 + (int)(10*Math.random());
    /* display 1-10: col for a b c and d  */
    System.out.println( "1-10:\t" + a + "\t" + b + "\t" + c +"\t"+ d );

    /*pick four random integers, each 1-6*/
    a = 1 + (int)(6*Math.random());
    b = 1 + (int)(6*Math.random());
    c = 1 + (int)(6*Math.random());
    d = 1 + (int)(6*Math.random());
    System.out.println( "1-6:\t" + a + "\t" + b + "\t" + c +"\t"+ d );

    /*pick a single random integer, 1-100*/
    a = 1 + (int)(100*Math.random());
/* display 1-100: col for a only and all having the same random number displayed */
    System.out.println( "1-100:\t" + a + "\t" + a + "\t" + a +"\t"+ a );

    /*pick four random integers, each 1-100*/
    a = 1 + (int)(100*Math.random());
    b = 1 + (int)(100*Math.random());
    c = 1 + (int)(100*Math.random());
    d = 1 + (int)(100*Math.random());
    System.out.println( "1-100:\t" + a + "\t" + b + "\t" + c +"\t"+ d );

    /*pick four random integers, each 0-99*/
    a = 0 + (int)(100*Math.random());
    b = 0 + (int)(100*Math.random());
    c = (int)(100*Math.random());
    d = (int)(100*Math.random());
    System.out.println( "0-99:\t" + a + "\t" + b + "\t" + c +"\t"+ d );

    /*pick four random integers, each 10-20*/
    a = 10 + (int)(11*Math.random());
    b = 10 + (int)(11*Math.random());
    c = 10 + (int)(11*Math.random());
    d = 10 + (int)(11*Math.random());
    /* display 1-10: col for a b c and d starting after 10 and up to 20  */
    System.out.println( "10-20:\t" + a + "\t" + b + "\t" + c +"\t"+ d );

/*display four random doubles, each 0-1: floats displayed one oin each col*/
    System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );
    System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );


/*Math.random()  */
    r = 10 * Math.random();
    /*Math.random() displayed integers from 0 to 9.99 */
    System.out.println( "0-9.99:\t" + r );
    /*Math.random() displayed integers from 0 to 9 */
    System.out.println( "0-9:\t" +(int)r);
    /*Math.random() displayed integers from 0 to 10 */
    System.out.println( "1-10:\t" + (1+ (int)r) );

  }
}
