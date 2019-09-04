package cn.wang.d07_thread.t01;

public class Thread_test extends Thread {
    public Thread_test(){}

    public Thread_test(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run:"+i);
        }
//        System.out.println(this.getName());
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getName());
    }
}
