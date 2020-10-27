package mythread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExcutorService {
    static MyExcutorService instance = new MyExcutorService();
    static int j;

    public static class Runnable1 implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (instance) {
                    j++;
                    System.out.println(Thread.currentThread().getName() + "  " + j);

                    try {
                        Thread.sleep(1000);
                        instance.notify();
                        instance.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static class Runnable2 implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (instance) {
                    j--;
                    System.out.println(Thread.currentThread().getName() + "  " + j);

                    try {
                        Thread.sleep(1000);
                        instance.notify();
                        instance.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Runnable1 r1 = new Runnable1();
        Runnable2 r2 = new Runnable2();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r1);
        executorService.submit(r2);

    }

}
