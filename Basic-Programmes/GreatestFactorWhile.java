package Loops;
import java.util.Scanner;
public class GreatestFactorWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int greatestfactor = 0;
        int i =n-1;
        while(i >= 1){
            if(n%i==0){
                greatestfactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest Factor is: " + greatestfactor);

    }
}
