package Loops;
import java.util.Scanner;
public class ConditionalLeapYear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1582 || (n%400 == 0 ||(n%4==0 && n%400!=0))){
            System.out.println(n+" is a Leap Year");
        }else{
            System.out.println(n+" is not a Leap Year");
        }
    }
}
