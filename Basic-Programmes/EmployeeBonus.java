package Loops;
import java.util.Scanner;
public class EmployeeBonus {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary :");
        double salary = sc.nextDouble();
        System.out.print("Enter Years Of Services :");
        int year = sc.nextInt();
        for(int i = 0 ; i<=year ; i++ ){
            double bonus = salary * i/100;
            System.out.println("bonus for " + i + " years is " + bonus);
        }
    }
}
