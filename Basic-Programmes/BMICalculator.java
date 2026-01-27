package Loops;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();
        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}

