package Loops;
import java.util.Scanner;
public class NOddEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            if(i%2 == 0) System.out.println(i+" is a Even Number");
            else System.out.println(i+" is a Odd Number");
        }
    }
}
