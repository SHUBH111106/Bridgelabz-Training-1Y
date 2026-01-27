package Loops;
import java.util.Scanner;
public class GreatestFactor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int greatestfactor = 0;
        for(int i = n-1 ; i >= 1 ; i--){
            if(n%i==0){
                greatestfactor = i;
                break;
            }
        }
        System.out.println("Greatest Factor is: " + greatestfactor);

    }
}
