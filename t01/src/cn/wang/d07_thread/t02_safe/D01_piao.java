package cn.wang.d07_thread.t02_safe;

public class D01_piao implements Runnable{
    private int piao = 100;
    @Override
    public void run() {
        while (true) {
            if (piao > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->" + piao--);
            }
        }
    }
}
