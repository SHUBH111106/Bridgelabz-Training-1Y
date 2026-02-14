
import java.util.*;
public class MatrixBasicOperations{
    public static int[][] add(int[][] a,int[][] b){
        int[][] r=new int[2][2];
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                r[i][j]=a[i][j]+b[i][j];
        return r;
    }
    public static void main(String[] args){
        int[][] a={{1,2},{3,4}};
        int[][] b={{5,6},{7,8}};
        System.out.println(Arrays.deepToString(add(a,b)));
    }
}
