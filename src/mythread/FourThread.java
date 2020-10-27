package mythread;

/**
 * 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1
 */
public class FourThread {
    static FourThread instance = new FourThread();
    static int j;
    Thread addT = new Thread(new Runnable() {
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
    });
    Thread subT = new Thread(new Runnable() {
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
    });

    public static void main(String[] args) {

        FourThread fourThread = new FourThread();
        FourThread fourThread2 = new FourThread();
        fourThread.addT.start();
        fourThread.subT.start();
        fourThread2.addT.start();
        fourThread2.subT.start();

    }

}
