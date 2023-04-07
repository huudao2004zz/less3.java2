public class MainThreadExample {
    public static void main(String[] args) {
        // Create and start thread1
        Thread thread1 = new Thread(new Task("first"));
        thread1.start();

        // Create and start thread2
        Thread thread2 = new Thread(new Task("Thread 2"));
        thread2.start();

        // Create and start thread3
        Thread thread3 = new Thread(new Task("Thread 3"));
        thread3.start();

        // Display information when exiting each thread
        try {
            thread1.join();
            System.out.println("Thread 1 has finished");
            thread2.join();
            System.out.println("Thread 2 has finished");
            thread3.join();
            System.out.println("Thread 3 has finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread continues after all three threads have finished
        System.out.println("Main thread has finished");
    }
}

class Task implements Runnable {
    private String threadName;

    public Task(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println(threadName + " has started");
        // Perform some task
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " has finished");
    }
}
