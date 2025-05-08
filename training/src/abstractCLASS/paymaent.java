package abstractCLASS;
// Q1.
// abstract class Innerpaymaent {
//     abstract void pay(int a);
//     void print()
//     {
//         System.out.println("payment done");
//     }
// }

// class UPI extends Innerpaymaent{
//     void pay(int a){
//         System.out.println("pay amount is : "+ a );
//     }
// }

// public class paymaent {
//     public static void main(String[] args) {
//         Innerpaymaent obj = new UPI();
//         obj.pay(40000);
//         obj.print();

//     }
// }

// Q2. 
// // create  an abstract class Shape with an abstract method area() implement two subclass cicle and ractangle 
// abstract class Shape{
//     // abstract void area(int r);
//     abstract void area(int l,int b);
//     void h()
//     {
//         System.out.println("shape");
//     }
// }

// class circle extends Shape{
//     void area(int r,int v)
//     {
//         System.out.println("the area of circle is : "+ (3.14*r*r));
//     }
// }

// class ractangle extends Shape{
//     void area(int l ,int b)
//     {
//         System.out.println("the area of circle is : "+ (l*b));
//     }
// }

// public class paymaent {
//     public static void main(String[] args) {
//         Shape o = new circle();
//         o.area(3, 12);
//         Shape o1 = new ractangle();
//         o1.area(3, 12);
//     }
// }

// Q3. creatre an abstract class Animalwith method sound() create class Dog() and class Cat() the extends it and impleamnet the sound method 
abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    void sound()
    {
        System.out.println("baarkkk.......");
    }
}

class Cat extends Animal{
    void sound()
    {
        System.out.println("mewwww ....");
    }
}

public class paymaent {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal Cat = new Cat();
        System.out.println();
        System.out.print("THe dog sounds like : ");
        dog.sound();
        System.out.println();
        System.out.print("THe Cat sounds like : ");
        Cat.sound();
        System.out.println();
    }
}