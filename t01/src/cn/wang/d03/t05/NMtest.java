package cn.wang.d03.t05;

public class NMtest {
    public static void main(String[] args) {
        NMclass nMclass = new NMclass() {
            @Override
            public void func() {
                System.out.println("匿名内部对象");
            }
        };
        nMclass.func();

        new NMclass() {
            @Override
            public void func() {
                System.out.println("匿名内部类");
            }
        }.func();
    }
}
