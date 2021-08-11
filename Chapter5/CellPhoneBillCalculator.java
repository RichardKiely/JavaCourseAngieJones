package Chapter5;

import java.util.Scanner;

public class CellPhoneBillCalculator {

    public static void main(String[] args) {

        double overAgeCharge = .25;
        double tax = .15;
        double subTotal=0;
        System.out.println("Please enter the plan fee: ");
        Scanner input = new Scanner(System.in);
        double planFee= input.nextDouble();

        System.out.println("Please enter the overage minutes: ");
        double overAgeMinutes = input.nextDouble();


       double overAgeResult =  calculateOverAgeFee(overAgeMinutes,overAgeCharge);
       subTotal += overAgeResult + planFee;
       double totalTax = calculateTax(subTotal);
        double total = finalTotal(planFee,overAgeResult,totalTax);

        System.out.println("Phone Bill Statement \n" +
                "Plan: €" + planFee +
                "\nOverage: €" + overAgeResult +
                "\nTax: €" + String.format("%.2f",totalTax) +
                "\nTotal €" + String.format("%.2f",total));

    }
    public static double calculateTax(double subTotal){
        double tax = .15;
        return subTotal * tax;
    }
    public static double calculateOverAgeFee(double overAgeMinutes, double overAgeCharge){

        double overageFee = overAgeMinutes * overAgeCharge;
        return  overageFee;
    }
    public static double finalTotal(double planFee,double overageFee,double tax ){
        double finalTotal = planFee + overageFee + tax;

        return finalTotal;

    }
}
