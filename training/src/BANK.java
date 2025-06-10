import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    private String type ; 
    private double amount;

    Transaction(String type , double amount){
        this.type = type;
        this.amount = amount;
    }

    public String toString()
    {
        return type + " "+ amount;
    }
}

class Account {
    private int accNumber;
    private String name;
    private double balance;

    public Account(String n, int aN, double b) {
        this.accNumber = aN;
        this.balance = b;
        this.name = n;
    }

    ArrayList<Transaction> transaction = new ArrayList<>();

    public void deposite(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            transaction.add(new Transaction("Deposite",amount));
        } else {
            System.out.println("enter a valid amount.....");
        }
    }

    public void Checktransaction()
    {
        if(transaction.isEmpty())
        {
            System.out.println("No Transaction Yet ... ");
        }
        else{
            for(Transaction t : transaction)
            {
                System.out.println(t);
            }
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance = this.balance - amount;
            transaction.add(new Transaction("Withdraw" , amount));
        } else {
            System.out.println("the amount you pass is exceeding the balance limit !..");
        }
    }

    public void CheckBalance() {
        System.out.println("Your Current Bank Balance is : " + this.balance);
    }
}

public class BANK {

    public static void main(String[] args) {
        int check = 0 ;
        Scanner in = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("Enter Account Holder's Name : ");
        String n = in.nextLine();
        System.out.println("Enter Custom Accout Number  : ");
        int AN = in.nextInt();
        System.out.println("Enter The Balance you want to add: ");
        double b = in.nextInt();

        Account a1 = new Account(n, AN, b);

        System.out.println("What can i help you ! " );
        do{
             System.out.println("Enter\n 1.Deposite \n 2.Withdraw \n 3.View Transactions \n 4. Check Bank Balance  ");
            int r = in.nextInt();
            switch (r) {
                case 1:
                {
                    System.out.println("Enter amount you Want to Deposite : ");
                    double amount = in.nextDouble();
                    a1.deposite(amount);
                }
                break; 

                case 2:
                {
                    System.out.println("Enter amount you Want to Withdraw : ");
                    double amount = in.nextDouble();
                    a1.withdraw(amount);
                }
                break; 
                case 3:
                {
                    a1.Checktransaction();
                }
                break; 
                case 4:
                {
                    a1.CheckBalance();
                }
                break; 
                default:
                System.out.println("enter a valid option");
                    break;
            }
            check++;
        }while(check!=5);
    }    
}
