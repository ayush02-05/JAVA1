package basic;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        // // 1. Check Even or Odd using if-else
        // int n = 13;
        // if(n%2==0)  System.out.println(n+" :is even");
        // else System.out.println(n+" :is odd");

        // // 2. Check Positive, Negative or Zer0
        // System.out.print("enter number :");
        // int n = in.nextInt();
        // if(n>0) System.out.println("positive");
        // else if(n<0) System.out.println("negative");
        // else System.out.println("zero");

        // // 3. Find Greatest of Two Numbers using if-else
        // System.out.println("enter first number");
        // int a = in.nextInt();
        // System.out.println("enter second number");
        // int b = in.nextInt();
        // if(a>b) System.out.println(a+" is greater");
        // else System.out.println(b+" is greater");

        // // 4. Check whether a character is vowel or consonant using switch-case
        // System.out.println("Enter character: ");
        // char c = in.next().charAt(0);
        // switch (c) {
        //     case 'a': case 'e': case 'i': case 'o': case 'u':
        //         System.out.println("vowel");
        //         break;
        //     default:
        //     System.out.println("consonent");
        //         break;
        // }

        // // 5. Print numbers from 1 to N using a for loop
        // System.out.println("enter number : ");
        // int n = in.nextInt();
        // for(int i=1;i<=n ;i++)
        // {
        //     System.out.println(i);
        // }

        // // 6. Sum of first N natural numbers using while loop
        // int sum=0;
        // System.out.println("enter number :");
        // int n = in.nextInt();
        // for(int i=1;i<=n;i++)
        // {
        //     sum+=i;
        // }
        // System.out.println(sum);

        // // 7. Print multiplication table of a number using loop
        // System.out.println("enter number :");
        // int n = in.nextInt();
        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println(n+" x "+i+" = "+n*i);
        // }

        // //  8. Check whether a number is divisible by 5 and 11 using if-else
        // System.out.println("enter number : ");
        // int n = in.nextInt();
        // if(n%5==0 && n%11==0) System.out.println("number is divisible by both 5 and 11");
        // else if(n%5==0) System.out.println("number is divisible by 5 ");
        // else if(n%11==0) System.out.println("number is divisiblee by 11");
        // else System.out.println("number is not divisible by neither 5 nor 11");

        // // 9. Type casting example: Convert float to int and print both
        // float a = 3.4f;
        // int b = 4;
        // b = (int)a;
        // System.out.println(a+" -- "+b);

        // // 10. Check whether a number is a multiple of 3 or not using if-else
        // System.out.println("enter number : ");
        // int n= in.nextInt();
        // if(n%3==0) System.out.println("number is multiple of 3");
        // else System.out.println("number is not divisible of 3");

        // // 11. Take a character input and print its ASCII value (Type casting)
        // System.out.println("enter any character : ");
        // char c = in.next().charAt(0);
        // int ascii = (int)c;
        // System.out.println("the ascii value of : "+c+" is "+ascii);

        // // 12. Find factorial of a number using for loop
        // System.out.println("enter number :");
        // int n = in.nextInt();
        // int fact =1;
        // for(int i=1;i<=n;i++)
        // {
        //     fact *= i;
        // }
        // System.out.println(fact);

        // // 13. Write a program to print reverse of a number using while loop
        // System.out.println("enter number :");
        // int n =in.nextInt();
        // int num=0;
        // while (n>0){
        //     int r = n%10;
        //     num = num*10 + r;
        //     n =n/10;
        // }
        // System.out.println(num);

        // // 14. Check whether a number is prime or not using loop and if-else
        // System.out.println("enter number :");
        // int n=in.nextInt();
        // if(n == 1 || n<1) System.out.println("number is not prime..");
        // else{
        //     int i=2;
        //     boolean isprime = true;
        //     while (i<n-1)
        //     {
        //         if(n%i==0){
        //             isprime = false;
        //             break;
        //         }    
        //     }
        //     if(isprime)
        //     {
        //         System.out.println("number is a primer");
        //     }
        //     else{
        //         System.out.println("number is not a primer");
        //     }
        // }

        // // 15. Use switch-case to build a simple calculator (Add, Sub, Mul, Div)
        // System.out.println("enter first element:");
        // int a = in.nextInt();
        // System.out.println("enter second element:");
        // int b = in.nextInt();
        // System.out.println("enter operator:");
        // char ope = in.next().charAt(0);
        // switch (ope) {
        //     case '+':
        //         System.out.println("addition :"+(a+b));
        //         break;
        //     case '-':
        //         System.out.println("subtration :"+(a-b));
        //         break;
        //     case '*':
        //         System.out.println("multiplication :"+ (a*b));
        //         break;
        //     case '/':
        //         if(b==0) {
        //             System.out.println("can not divide ...");
        //             break;
        //         }else{
        //             System.out.println("division :"+(a/b));
        //             break;
        //         }
        //     case '%':
        //         if(b==0) {
        //             System.out.println("can not divide ...");
        //             break;
        //         }else{
        //             System.out.println("reminder :"+(a%b));
        //             break;
        //         }      
        //     default:
        //         System.out.println("invalid operation");
        //         break;
        // }
    }
}
