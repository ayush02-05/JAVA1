package Encapsulation;

class Bank1{
    private double balance = 0 ;
    void getter()
    {
        System.out.println("your current account balnce is : "+ balance);
    }
    void deposite(double amount)
    {
        if(amount>0)
        {
            this.balance += amount;
        }
        else{
            System.out.println("enter valid amount");
        }
    }
    void withdraw(double amount)
    {
        if(amount>0)
        {
            this.balance -= amount;  // this.balance = balance -amount 
        }
        else{
            System.out.println("enter valid amoount");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Bank1 ayush = new Bank1();
        Bank1 aryan = new Bank1();
        ayush.deposite(30000);
        ayush.getter();
        aryan.getter();
        ayush.withdraw(5000);
        aryan.deposite(5000);
       ayush.getter();
        aryan.getter(); 
    }
}
