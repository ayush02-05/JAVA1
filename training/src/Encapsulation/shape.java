package Encapsulation;

class Ractangle{
    private int length ;
    private int width;

    void set(int l , int w)
    {
        this.length = l;
        this.width = w;
    }
    void get()
    {
        int parameter = (2*(this.length+this.width));
        int area = this.length*this.width ; 
        System.out.println("the parameter of ractangle is : "+parameter);
        System.out.println("the area of ractangle is : "+ area);
    }
}

public class shape {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle();
        r1.set(3, 4);
        r1.get();
    }
}
