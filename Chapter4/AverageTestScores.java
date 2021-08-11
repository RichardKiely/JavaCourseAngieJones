package Chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner input = new Scanner(System.in);

        for(int i=0; i<numberOfStudents;i++){
            double total = 0;

            for(int j=0; j<numberOfTests;j++){

                System.out.println("Enter your test score #" + (j+1));
                double score = input.nextDouble();

                total += score;

            }

            double average = total/numberOfTests;
            System.out.println("The test average for student #" +(i+1) + " is " + average);
        }

        input.close();
    }
}
