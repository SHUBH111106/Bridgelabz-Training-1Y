
import java.util.*;
public class EuclideanDistanceAndLineEquation{
    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(distance(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        sc.close();
    }
}
