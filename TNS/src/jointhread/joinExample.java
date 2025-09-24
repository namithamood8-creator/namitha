package jointhread;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);  // pause for half a second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}  // <-- closed MyThread class properly

public class joinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        try {
            t1.join();   // main thread waits until t1 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
        try {
            t2.join();   // main thread waits until t2 finishes
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t3.start();  // runs after t1 and t2 are done
    }
}
