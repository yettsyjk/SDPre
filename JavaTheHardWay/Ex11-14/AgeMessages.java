import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if( age < 13 ){
      System.out.println( "\ttoo young to create a Facebook account" );
    }
    /*add opposite if statement */
    if( age >= 13 ) {
      System.out.println( "\tOld enough to create a Facebook account" );
    }


    if( age < 16 ){
      System.out.println( "\ttoo young to get a driver's license" );
    }
    /*add opposite if statement */
    if ( age >= 16 ){
      System.out.println( "\tOld enough to get a driver's license" );
    }

    if( age < 18 ){
      System.out.println( "\ttoo young to get a tattoo" );
    }
    /*add opposite if statement */
    if ( age >= 18 ) {
      System.out.println( "\tOld enough to get a tattoo, but don't ..it's not worth it" );
    }

    if( age < 21 ){
      System.out.println( "\ttoo young to drink alcohol" );
    }
    /*add opposite if statement */
    if( age >= 21) {
      System.out.println( "\tOld enough to drink alcohol, but again don't.. order the mocktails haha" );
    }

    if( age < 35){
      System.out.println( "\ttoo young to run for President of the U.S." );

      System.out.println( "\t\t(How sad!)" );
    }
    /*add opposite if statement */
    if ( age >= 35 ){
        System.out.println( "\tOld to run for President of the U.S." );
    }
    /*add if statement if age is greater than or equal to 65 you are old enough to retire*/
    if( age >= 65 ){
      System.out.println( "\tYou are old enough to retire!" );
    }


    keyboard.close();

  }
}
/*If you type an age older than 35 the printed display id " You are: "*/
