package Loops;
import java.util.Scanner;
public class MultiplesWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0 && n<=100) {
            int i =100;
            while(i>=1){
                if(i%n==0){
                    System.out.println("The multiples of "+n+" is " + i);
                }
                i--;
            }
        }
    }
}
