package cn.wang.d07_thread.t01;

public class Run_test {
    public static void main(String[] args) {
        Runnable_test rt = new Runnable_test();
        Thread t = new Thread(rt);
        t.start();
    }
}
