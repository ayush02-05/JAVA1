package MultiThreading;

class Mythread extends Thread{
    public void run(){
        for(int i =0 ; i<=10 ; i++)
        {
            System.out.println(getName()+"is running");
            Thread.yield();
        }
    }
}

public class mt2 {

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.setName("lowerPriority");
        t2.setName("higherPriority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
//     public static void main(String[] args) {
//         // Thread t1 = new Thread(()->{
//         //     System.out.println("hello");
//         // });
//         //  Thread t2 = new Thread(()->{
//         //     System.out.println("hiii");
//         // });
//         // t1.start();
//         // t2.start();
//     }
}
