package Chapter4;

import java.util.Random;

public class RollTheDiceGame {
    public static void main(String[] args) {

        int lastSpace = 20;
        int currentSpace=0;
        int maxRolls = 5;
        Random random = new Random();
        System.out.println(" The objective of the game is to travel the entire game board "
        + "\nof 20 spaces within 5 dice rolls "
           +     "\n\n Lets begin..........");




        for(int i=1;i<=maxRolls;i++){


            int score = random.nextInt(6) + 1;
            currentSpace += score;

            System.out.println(String.format("Roll #%d: You've rolled a %d. ", i ,score));

            if(currentSpace == lastSpace){
                System.out.println("You're on space " + currentSpace + " well done you Win!!!");
                break;
            }
            else if(currentSpace > lastSpace){

                System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces you lose!");
                break;
            }
            else if(i == maxRolls && currentSpace < lastSpace){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("\nUnfortunately, you didnt make it to all " +
                        lastSpace + " spaces. You lose");
            }else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You are on space " + currentSpace +
                        " and have " + spacesToGo + " more to go");
            }
            System.out.println();
        }
    }
}
