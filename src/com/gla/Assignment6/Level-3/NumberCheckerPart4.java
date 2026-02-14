
import java.util.*;
public class NumberCheckerPart4{
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n){
        int sq=n*n,sum=0;
        while(sq>0){ sum+=sq%10; sq/=10; }
        return sum==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isNeon(n));
        sc.close();
    }
}
