package cn.wang.d03.t02;

public class Implements_test implements Interface_test {
    @Override
    public void func() {
        System.out.println("实现抽象方法");
    }

    @Override
    public void mofun() {
        System.out.println("重写默认方法");
    }
}
