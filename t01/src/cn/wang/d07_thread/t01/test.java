package cn.wang.d07_thread.t01;

public class test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread_test tt = new Thread_test();
        tt.setName("一");
        tt.start();
        new Thread_test("二").start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main:"+i);
        }

    }
}
