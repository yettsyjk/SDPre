import java.util.Scanner;

public class PigDice {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int roll, ptot, ctot, turnTotal;
    String choice;
    choice = " ";
    ptot = 0;/*holds user total*/
    ctot = 0;/*computer total*/
    /*nested do while loop*/
    do {
      turnTotal = 0;
      System.out.println(" You have "+ ptot + " points.");

      do {
        roll = 1 + (int)(6*Math.random());
        System.out.println("\tYou rolled a "+ roll + ".");
        if (roll == 1){
          System.out.println("\tThat ends your turn. ");
          turnTotal = 0;
        }
        else {
          turnTotal += roll;
            System.out.print("\tYou have " + turnTotal + " points.");
            System.out.print(" so far this round.\n");
            System.out.print("\tWould you like to \"roll\" again");
            System.out.print(" or \"hold\"? ");
            choice = keyboard.next();
          }
        } while(roll != 1 && choice.equals("roll"));

        ptot += turnTotal;
        System.out.println("\tYou end the round with " + ptot + " points." );
        /*computer doesnt get a turn if user reached 100 points*/
          if(ptot < 100){/*loop repeats as long as ptot and ctot are less than 100*/
            turnTotal = 0;
            System.out.println("Computer has "+ ctot + " points.");

            do {
              roll = 1 + (int)(6*Math.random());
              System.out.println("\tComputer rolled a "+ roll + " .");
              if(roll == 1) {
                System.out.println("\tThat ends its turn. ");
                turnTotal = 0;
              }
              else {
                turnTotal += roll;
                System.out.print("\tComputer has "+ turnTotal );
                System.out.print("  so far this round.\n");
                if( turnTotal < 20 ){
                  System.out.println("\tComputer will roll again");
                }
              }
            } while ( (roll != 1 && turnTotal < 20) || (turnTotal >= 100) );
            /*modify computer turn will stop after 20 points OR when earned enough points to win*/
            ctot += turnTotal;
            System.out.print("\tComputer ends the round with ");
            System.out.print( ctot + " points\n");
            }
            /*ends the do while loop containing the whole game*/
          } while(ptot < 100 && ctot < 100);
          /*determines the winner*/
          if(ptot > ctot){
            System.out.println("Humanity wins");
          }
          else {
            System.out.println("The computer wins.");
          }
    }
}
