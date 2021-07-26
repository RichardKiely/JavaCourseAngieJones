package Chapter3;

import java.util.Scanner;

public class EuroGame {
    public static void main(String[] args) {

        double pennies =.01;
        double tens=.10;
        double twenties=.20;
        double fifties=.50;
        int euro = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Euro'! " +
                "Your goal is to enter enough change to make exactly €1.00");

        System.out.println("Please enter how many pennies you would like to use");
        int numOfPennies = input.nextInt();

        System.out.println("Please enter how many tens you would like to use");
        int numOfTens = input.nextInt();

        System.out.println("Please enter how many twenties you would like to use");
        int numOfTwenties = input.nextInt();

        System.out.println("Please enter how many fifties you would like to use");
        int numOfFifties = input.nextInt();

        input.close();

        double result = numOfPennies* pennies + numOfTens* tens + numOfTwenties* twenties + numOfFifties * fifties;

        if(result < euro){
            double amountShort = euro - result;
            System.out.println("Sorry you lose! You were short " + String.format("%.2f",amountShort) + " cents.");
        }else if(result > euro){
            double amountOver = result - euro;
            System.out.println("Sorry you lose! You were over " + String.format("%.2f",amountOver) );
        }else{
            System.out.println("Yay that's exactly €1.00! You win ");
        }



    }
}
