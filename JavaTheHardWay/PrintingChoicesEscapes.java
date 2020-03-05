public class PrintingChoicesEscapes {
  public static void main (String [] args){
    //print copy with escapes and must be identical to previous exercise
    System.out.println( "Alpha\nBrava\nCharlie\nDelta\n\nEchoFoxtrotGolf\nHotel\nIndia\n\nThis is a test.\n\nI am learning Java the hard way!" );


    System.out.println("Alpha");
    System.out.println("Bravo");

    System.out.println("Charlie");
    System.out.println("Delta");
    System.out.println();

    System.out.print("Echo");
    System.out.print("Foxtrot");

    System.out.println("Golf");
    System.out.print("Hotel");
    System.out.println();
    System.out.println("India");

    System.out.println();
    System.out.println("This" + " " + "is"+ " "+ "a" + " "+ "test.");
    System.out.println("I " + "am " + "learning "+ "Java "+ "the " + "hard "+"way!");
  }
}
