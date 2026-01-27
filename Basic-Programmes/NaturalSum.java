package Loops;
import java.util.Scanner;
public class NaturalSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1 ;
        int Sum = 0 ;
        while(i<= n){
            Sum+=i;
            i++ ;
        }
        System.out.println(Sum);
    }

}
