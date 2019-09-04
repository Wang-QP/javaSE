package cn.wang.d07_thread.t04_test;

public class BaoziPu extends Thread{
    private Baozi bz;

    public BaoziPu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        System.out.println(Thread.currentThread().getName());
        while (true) {
            synchronized (bz){
                if (bz.flag){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (count%2==0){
                    bz.pi = "薄皮";
                    bz.xian = "猪肉馅";
                }else {
                    bz.pi = "冰皮";
                    bz.xian = "豆沙馅";
                }
                count ++;
                System.out.println("包子铺正在做："+bz.pi+bz.xian+"包子");
                try {
                    bz.flag = true;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.notify();
            }
        }
    }
}
