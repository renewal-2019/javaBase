package mythread;

//两个线程，交替输出1A2B3C4D5E.....
public class TwoThreads {

    public void twoThreadsPrint(char[] numbers, char[] zimu) {
        Object o = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    for (char c : numbers) {
                        System.out.println(c);
                        try {
                            System.out.println("唤醒t2");
                            o.notify();
                            System.out.println("t1等待");
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    o.notify();//就是为了让等待的t2线程停止等待从而结束
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o) {
                    for (char c : zimu) {
                        System.out.println(c);
                        try {
                            System.out.println("唤醒t1");
                            o.notify();
                            System.out.println("t2等待");
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });

        t1.start();
        t2.start();

    }

    public static void main(String[] args) {

        char[] char1 = "123456789".toCharArray();
        char[] char2 = "ABCDEFGHI".toCharArray();
        new TwoThreads().twoThreadsPrint(char1, char2);

    }

}
