
import java.util.*;
public class MatrixAdvancedOperations{
    public static int determinant2x2(int[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }
    public static void main(String[] args){
        int[][] m={{1,2},{3,4}};
        System.out.println(determinant2x2(m));
    }
}
