import static java.lang.System.*;
/**/
public class OverlyComplexFlag {
  public static void main (String[] args){
    printTopHalf();/*function defined within main block causes program to pause and await execution*/

    print48Colons();
    print48Ohs();/*capital O not zero*/
    print48Colons();
    print48Ohs();/*capital O not zero*/
    print48Colons();
    print48Ohs();/*capital O not zero*/
    printPledge();/*print pledge below the flag*/
  }

  public static void print48Colons(){
    out.println( "|::::::::::::::::::::::::::::::::::::::::::::::::::|" );
  }

  public static void print48Ohs(){
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print29Colons(){
    out.println( "|:::::::::::::::::::::::::::::::|" );
  }

  public static void printPledge(){
    out.println( "I pledge allegiance to the flag. " );
  }

  public static void print29Ohs(){
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print6Stars(){
    out.print( "| *  *  *  *  *  * " );
  }

  public static void print5Stars(){
    out.print( "|  *  *  *  *  *   " );
  }

  public static void printSixStarLine(){
    print6Stars();
    print29Ohs();
  }

  public static void printFiveStarLine(){
    print5Stars();
    print29Colons();
  }

  public static void printTopHalf(){

    out.println( "____________________________________________________" );

    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }

}
