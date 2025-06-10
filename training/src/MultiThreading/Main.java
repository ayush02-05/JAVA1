package MultiThreading;
class Mythread extends Thread {

    public void run()
    {
         for (int i = 1; i <= 5; i++) {
            System.out.println("Thread" + i);

            try {
                Thread.sleep(500);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        
    }

}

public class Main {

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main" + i);

            try {
                t1.sleep(500);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}