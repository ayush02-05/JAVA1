class student{
    student()
    {
        System.out.print("oo");
    }
    student(int a)
    {
        System.out.print("ll ");
        this();
    }
    student(int b,int c)
    {
        System.out.print("he ");
        this(5);
    }
}

public class hello {
    public static void main(String[] args) {
        student obj = new student(3,4);
        // System.out.println(obj);
    }
}