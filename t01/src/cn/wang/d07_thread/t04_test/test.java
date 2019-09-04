package cn.wang.d07_thread.t04_test;

public class test {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        BaoziPu bzp = new BaoziPu(bz);
        Chihuo ch = new Chihuo(bz);
        bzp.start();
        ch.start();
    }
}
