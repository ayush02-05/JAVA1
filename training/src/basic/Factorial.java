package basic;
// import java.util.Scanner;
// import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        
        // // 1. Factorial of a number
        // System.out.print("Enter number of you want factorial: ");
        // int n = in.nextInt();
        // int f=1;
        // for(int i=n;i>=1;i--)
        // {
            //     f = f*i;
            // }
            // System.out.print(f);
            
            // // 2. Print all factorials from 1 to n
            // System.out.print("Enter a number : ");
            // int n = in.nextInt();
            // for(int i=1;i<=n;i++)
            // {
                //     int f=1;
                //     for(int j=1;j<=i;j++)
                //     {
                    //         f=f*j;
                    //     }
                    //     System.out.println(i +"! = "+f);
                    // }
                    
                    // // 3. Check if a number is a Strong Number
                    // int n = 145;
        // int copy = n;
        // int sum =0;
        // while (n>0) {
        //     int r = n%10;
        //     int f=1;
        //     for(int i=1;i<=r;i++){
            //         f=f*i;
            //     }
        //     sum =sum+f;
        //     n=n/10;
        // }
        // if(sum == copy) System.out.println(" is strong number ");
        // else System.out.println(" is not strong number ");
        
        // // 5. Count trailing zeros in a factorial
        // System.out.println("enter number : ");
        // int n =in.nextInt();
        // int count=0;
        // for(int i=5;i>=1;i*=5)
        // {
        //     count+=n/i;
        // }
        // System.out.println(count);


        // //  6. Function to return factorial
        // System.out.println("enter number :");
        // int n = in.nextInt();
        // System.out.println(fact(n));
        
        // // 7. Print factorial using recursion
        // System.out.println("enter number :");
        // int n=in.nextInt();
        // int f = fac(n);
        // System.out.println(f);

        // //  8. Check if the factorial of n is even or odd
        // System.out.println("enter number :");
        // int n = in.nextInt();
        // int fact = fact(n);
        // if(fact%2==0) System.out.println("factorial is even");
        // else System.out.println("factorial is odd");

        // // 9. Print factorial table
        // System.out.println("enter number : ");
        // int n =in.nextInt();
        // int j=1;
        // for(int i=1;i<=n;i++)
        // {
        //     System.out.println(i+" x "+j+" = "+fact(i));
        //     j = fact(i);
        // }

        // // 10. Reverse factorial
        // System.out.println("enter number  :");
        // int n = in.nextInt();
        // int copy =n;
        // int i=1;
        // while (n != 1) {
        //     n=n/i;
        //     i++;
        // }
        // System.out.println("the reverse factorial of a number "+copy+" is = "+(i-1));

        
    }
    static int fact(int n)
    {
        int facto=1;
        for(int i=1;i<=n;i++)
        {
            facto*=i;
        }
        return facto;
    }
    static int fac(int n)
    {
        if(n==0 || n == 1) return 1;
        else  return n * fac(n-1);
    }
}