package Loops;
import java.util.Scanner;
public class NaturalNumberSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            int sum = n*(n+1)/2;
            System.out.println("The Sum of "+ n +" Natural Numbers is: "+ sum);
        }else{
            System.out.println("The Number " + n + " is not a Natural Number");
        }
    }
}