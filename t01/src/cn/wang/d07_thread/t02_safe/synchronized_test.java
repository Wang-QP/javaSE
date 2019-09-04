package cn.wang.d07_thread.t02_safe;

class Piao implements Runnable{
    private static int piao = 100;
    Object obj = new Object();

    //静态方法用的是本类class的属性-->class文件对象（反射）
    private static /*synchronized*/ void staticfunc(){
        synchronized (Runnable.class){
            if(piao>0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->" + piao--);
            }
        }
    }

    @Override
    public void run() {
        while(true){
//            func();
            staticfunc();
//            synchronized (obj){
//                if(piao>0){
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+"-->"+piao--);
//                }else {
//                    break;
//                }
//            }
        }
    }
    private /*synchronized*/ void func(){
        synchronized (this){
            if(piao>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->"+piao--);
            }
        }
    }
}

public class synchronized_test {
    public static void main(String[] args) {
        Piao piao = new Piao();
        Thread t1 = new Thread(piao);
        Thread t2 = new Thread(piao);
        Thread t3 = new Thread(piao);
        t1.start();
        t2.start();
        t3.start();
    }
}
