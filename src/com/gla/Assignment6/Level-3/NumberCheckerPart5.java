
import java.util.*;
public class NumberCheckerPart5{
    public static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++) if(n%i==0) sum+=i;
        return sum==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(isPerfect(sc.nextInt()));
        sc.close();
    }
}
