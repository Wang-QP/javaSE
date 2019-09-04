package cn.wang.d03.t03;

public class Zi extends Fu {
    int num = 10;
    public void func(){
        System.out.println("子类方法");
    }
    public void fun(){
        System.out.println("需要向下转型调用");
    }
}
