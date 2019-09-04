package cn.wang.d07_thread.t04_test;

public class Chihuo extends Thread{
    private Baozi bz;

    public Chihuo(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (true){
            synchronized (bz){
                if(!bz.flag){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃："+bz.pi+bz.xian+"包子");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("吃货吃完包子，等待包子铺做包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
