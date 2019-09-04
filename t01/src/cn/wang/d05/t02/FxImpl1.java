package cn.wang.d05.t02;

public class FxImpl1 implements FxInterface<String> {
    @Override
    public void func(String s) {
        System.out.println(s);
    }
}
