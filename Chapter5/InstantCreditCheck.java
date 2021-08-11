package Chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
   static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
   static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        //Initialize what we know
        double salary = getSalary();
        int creditScore = getCreditScore();

        //get what we don't know

        input.close();

        //check if the user is qualified
        boolean qualified = isUserQualified(creditScore,salary);

        //notify the user
        notifyUser(qualified);
    }
    public static double getSalary(){
        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        return salary;

    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditScore = input.nextInt();

        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;

        }else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You're approved");
        }
        else{
            System.out.println("Sorry! You're not approved");
        }
    }
}
