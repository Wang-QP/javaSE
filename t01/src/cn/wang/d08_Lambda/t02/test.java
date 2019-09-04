package cn.wang.d08_Lambda.t02;

public class test {
    public static void main(String[] args) {
        func(()->{
            System.out.println("做饭");
        });
    }
    public static void func(Cook cook){
        cook.makefood();
    }
}
