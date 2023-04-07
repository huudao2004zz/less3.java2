package s3;
public class MyThread extends Thread {
    private String message;
    private int duration;
    private int priority;

    public MyThread(String message, int duration, int priority) {
        this.message = message;
        this.duration = duration;
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.getId() + " (" + this.message + ") started with priority " + this.priority);
        try {
            Thread.sleep(this.duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + this.getId() + " (" + this.message + ") finished");
        MyThread thread1 = new MyThread("Thread 1", 2000, Thread.NORM_PRIORITY);
        MyThread thread2 = new MyThread("Thread 2", 3000, Thread.MAX_PRIORITY);
        MyThread thread3 = new MyThread("Thread 3", 1500, Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
