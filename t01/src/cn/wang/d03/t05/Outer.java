package cn.wang.d03.t05;

public class Outer {
    public void func() {
        final int num = 10;
        class Inner {
            public void func(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.func();
    }
}
