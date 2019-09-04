package cn.wang.d03.t04;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("open Mouse");
    }

    @Override
    public void close() {
        System.out.println("close Mouse");
    }

    public void click() {
        System.out.println("click");
    }
}
