package cn.wang.d03.t04;

public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("open Keyboard");
    }

    @Override
    public void close() {
        System.out.println("close Keyboard");
    }

    public void type(){
        System.out.println("type");
    }
}
