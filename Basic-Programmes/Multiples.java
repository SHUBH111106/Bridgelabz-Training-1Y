package Loops;
import java.util.Scanner;
public class Multiples {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=0 && n<=100) {
            for(int i=100;i>=1;i--){
                if(i%n==0){
                    System.out.println("The multiples of "+n+" is " + i);
                }
            }
        }
    }
}
