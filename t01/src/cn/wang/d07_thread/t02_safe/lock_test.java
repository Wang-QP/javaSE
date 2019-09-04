package cn.wang.d07_thread.t02_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class pay implements Runnable{
    private int piao = 100;
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            l.lock();
            if (piao > 0) {
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "-->" + piao--);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();
                }
            }
        }
    }
}


public class lock_test {
    public static void main(String[] args) {
        pay piao = new pay();
        Thread t1 = new Thread(piao);
        Thread t2 = new Thread(piao);
        Thread t3 = new Thread(piao);
        t1.start();
        t2.start();
        t3.start();
    }
}
