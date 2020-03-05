public class CreatingVariables {
  public static void main(String[] args){
    int x, y, age, distance;
    double seconds, e, checking, travel;
    String firstName, lastName, title, highway, state;

    x = 10;
    y = 400;
    age = 39;
    distance = 10;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    travel = 15.00;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    highway = "I25";
    state = "CO";

    System.out.println( "The variable x contains "+ x );
    System.out.println( "The value "+ y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + "seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $"+ checking + "!" );
    System.out.println( "My name's "+ title + " "+ firstName + " "+ lastName );
    System.out.println( "I've only traveled "+ distance + "miles in the last "+ travel + " minutes."+ " Traffic is getting bad in "+ state + "." );
  }
}
