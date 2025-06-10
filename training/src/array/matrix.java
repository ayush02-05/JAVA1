package array;
import java.util.Scanner;

public interface matrix {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        // 1. Matrix Print (2D array ko print karo)
        int a[][] = new int[3][3];
        System.out.println("enter elements :");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
