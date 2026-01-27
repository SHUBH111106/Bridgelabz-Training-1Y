package Loops;
import java.util.Scanner;
public class WhilePower {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        int res = 1;
        int i =1;
        while(i<=pow){
            res*=n;
            i++;
        }
        System.out.println(res);
    }
}
