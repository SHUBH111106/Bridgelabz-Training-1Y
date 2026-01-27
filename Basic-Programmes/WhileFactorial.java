package Loops;
import java.util.Scanner;
public class WhileFactorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
    }
}
