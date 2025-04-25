package method;
import java.util.Scanner;
public class existance {
    static void Exist(int[] a ,int n)
    {
        int i=0;
        int found =0;
        while (i<a.length) {
            if(a[i] == n)
            {
                found = 1 ;
                break;
            }
            i++;
        }
        if(found == 1)
        {
            System.out.println("exists");
        }
        else{
            System.out.println("does not exists");
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = in.nextInt();
        Exist(arr , n);
    }
}
