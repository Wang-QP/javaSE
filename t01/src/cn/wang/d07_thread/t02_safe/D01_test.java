package cn.wang.d07_thread.t02_safe;

public class D01_test {
    public static void main(String[] args) {
        D01_piao d = new D01_piao();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);
        t1.start();
        t2.start();
        t3.start();
    }
}
