package cn.wang.d03.t02;

public class test {
    public static void main(String[] args) {
        Implements_test implements_test = new Implements_test();
        implements_test.func();
        implements_test.mofun();

        Interface_test.jingfunc();

        System.out.println(Interface_test.NUM);
    }
}
