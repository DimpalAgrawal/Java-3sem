/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 10/29/2020
 *   Time: 8:36 PM
 *   File: Thread.java
 */

public class ThreadWithRunnableInterface implements Runnable {
    private final int LIMIT = 5;
    private final Thread thread;

    public ThreadWithRunnableInterface() {
        thread = new Thread(this, "T1");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < LIMIT; i++) {
            System.out.println(thread.getName() + "has started");

        }
        System.out.println(thread.getName() + "has ended");
    }
}

class main {
    public static void main(String[] args) {

        Thread main = Thread.currentThread();
        System.out.println(main);
        main.setName("GLA");
        System.out.println(main);
        ThreadWithRunnableInterface t1 = new ThreadWithRunnableInterface();
        t1.getThread().setPriority(Thread.MAX_PRIORITY);

    }
}