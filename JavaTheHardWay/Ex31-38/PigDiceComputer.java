public class PigDiceComputer {
  /*dice game for two or more players*/
  public static void main(String[] args){

    int roll, total;
    roll = 0;
    total = 0;

    /*do while loop be the first user to the bank and score 100 points*/
    do{
      roll = 1 + (int)(6*Math.random())
      System.out.println("Computer rolled a "+ roll + ".");
      if( roll == 1) {
        System.out.println("\tThat ends its turn.");
        total = 0;
      }
      else {
        total += roll;
        System.out.print("\tComputer has "+ total);
        System.out.print(" points so far this round.\n");
        if(total < 20) {
          System.out.println("\tComputer will roll again.");
        }
      }
    } while(roll != 1 && total < 20);
    System.out.println("Computer ends the round with "+ total + " points");
  }
}
