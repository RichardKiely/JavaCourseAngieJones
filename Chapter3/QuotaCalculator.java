package Chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quota = 10;

        System.out.println("Enter the number of sales you made this week");
        int sales = input.nextInt();
        input.close();

        if( sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short");
        }
    }
}