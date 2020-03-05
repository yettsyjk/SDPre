import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args){
    /*statically-typed programming language int Double String static, it can't be changed*/
    String firstName, location;
    int age;
    double weight, income;


    Scanner keyboard = new Scanner(System.in);
    /* print() question is printed but cursor is left alone after printing*/
    System.out.print( "Hello. What is your name?" );
    /* cli expects user to enter a name, when nothin us entered the cli continues to await input until exit */
    /* Any string is allowed l or leonard or Leonard*/
    firstName = keyboard.next();

    System.out.print( "Hi, "+ firstName + "! How old are you? " );
    /*User must enter a whole number int or the program errors out due tp nextInt() */
    /* Negative numbers are also allowed with nextInt() no error*/
    age = keyboard.nextInt();

    System.out.println( "So you're "+ age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, "+ firstName + "? ");
    /* weight was entered as 0.89 and -150 and it still accepted the user input*/
    weight = keyboard.nextDouble();

    System.out.println( weight +"lbs "+ "! Better keep that quiet!!" );
    System.out.println( "What state are you from? ");
    location = keyboard.next();
    System.out.print( "Finally, what's your income, " + firstName + "? " );
    /* nextDouble() allows user to enter negative income such as -1.0*/
    income = keyboard.nextDouble();


    System.out.print( "Hopefully that is " + income + " per hour" + "in "+ location);
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println(firstName + ".");

  }
}
