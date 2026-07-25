class PrinterTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

public class DemoThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj = new PrinterTask();

        Thread t1 = new Thread(obj, "Worker-1");
        Thread t2 = new Thread(obj, "Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
