public class ClubBouncer {
  public static void main(String[] args){
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ){
      System.out.println( "You are allowed to enter the club." );
    }
    /* adding a print statement above else statement creates a bug in code and doesn't compile because it's outside the main block*/
    // System.out.println( "WAT!" );
    else {
      System.out.println( "You are not allowed to enter the club (so stop sneaking in ha)" );
    }
  }
}
