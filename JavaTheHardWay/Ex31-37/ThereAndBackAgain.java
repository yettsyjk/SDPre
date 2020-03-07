public class ThereAndBackAgain {
  public static void main (String[] args){
    System.out.println( "Here. " );
    bilbo();/*function call for bilbo() ();required to compile*/
    System.out.println( "Back first time. " );
    bilbo();/*second function call pauses the program and jumps down*/
    /*function call for bilbo() pauses main and jumps down to body of bilbo and comes back up*/
    System.out.println( "Back second time. " );/*print last statement*/
  }  /*main ends the entire program*/
/*outside of main and inside body of bilbo()*/
  public static void bilbo() { /*write a function and execute by calling it*/
    System.out.println( "There. " );
  }
}
