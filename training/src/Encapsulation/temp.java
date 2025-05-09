package Encapsulation;

class temperature{

    private double celsius;

    void set (double c )
    {
        this.celsius = c;
    }
    double get()
    {
        double f ;
        f = (this.celsius*(1.8)) + 32 ; 
        return f;
    }
}

public class temp {
    public static void main(String[] args) {
        temperature t1 = new temperature();
        t1.set(4.6);
        double faren = t1.get();
        System.out.println("the temperature in farenhieght is : "+ faren);
    }
}
