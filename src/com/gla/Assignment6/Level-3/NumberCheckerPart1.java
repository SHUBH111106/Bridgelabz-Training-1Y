
import java.util.*;
public class NumberCheckerPart1{
    public static boolean isDuck(int n){
        String s=Integer.toString(n);
        for(int i=1;i<s.length();i++) if(s.charAt(i)=='0') return true;
        return false;
    }
    public static boolean isArmstrong(int n){
        String s=Integer.toString(n);
        int sum=0;
        for(char c:s.toCharArray())
            sum+=Math.pow(c-'0',s.length());
        return sum==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isDuck(n));
        System.out.println(isArmstrong(n));
        sc.close();
    }
}
