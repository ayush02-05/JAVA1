package Encapsulation;

class Employee
{
    private String name = "";
    private int id ;
    private double Salary = 0;

    void setter(String n , int i ,double s)
    {
        this.name = n;
        this.id = i;
        this.Salary = s ; 
    }

    void getter()
    {
        System.out.println("the name of enmployee is : "+ this.name);
        System.out.println(" id : "+ this.id);
        System.out.println("Salary: "+ this.Salary);

    }
}

public class E {
    public static void main(String[] args) {
        Employee ayush = new Employee();
        ayush.getter();
        ayush.setter("ayush", 344, 30000);
        System.out.println();
        ayush.getter();

    }
}
