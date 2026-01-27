package Loops;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value;
        value = sc.nextDouble();
        while (value != 0) {
            total = total + value;
            value = sc.nextDouble();
        }
        System.out.println("Sum = " + total);
    }
}

