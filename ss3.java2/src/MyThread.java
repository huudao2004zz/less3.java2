public class MyThread extends Thread {

    public MyThread() {
        super();
        // Set the name of the thread to "MyThread"
        setName("myJavaThread");
    }

    @Override
    public void run() {
        System.out.println("Starting thread: " + Thread.currentThread().getName());

        try {
            // Display the first 10 even numbers with a delay of 1500ms between each display
            for (int i = 2; i <= 20; i += 2) {
                System.out.println(i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Exiting thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Create and start the thread
        MyThread myThread = new MyThread();
        myThread.start();

        // Display the name of the current thread
        System.out.println("Current thread: " + Thread.currentThread().getName());
    }
}