package Encapsulation;

class Student{
    private String name = "";
    private int mark1 = 0;
    private int mark2 = 0;


    void Set(String n , int m1,int m2)
    {
        this.name = n ;
        this.mark1 = m1;
        this.mark2 = m2;

    }

    void get()
    {
        System.out.println("the name of the student is : "+ this.name );
        System.out.println("physics marks : "+ this.mark1);
        System.out.println("MAths marks : "+ this.mark2);
    }

}

public class s{
    public static void main(String[] args) {
        Student abc = new Student();
        abc.Set("ayush", 89, 90);
        abc.get();
    }
}
