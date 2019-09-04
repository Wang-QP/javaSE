package cn.wang.d14_func.t01;

public interface Print {
    public abstract void print(String s);

    public static void f(String s){
        System.out.println("静态方法用类名引用");
    }
}
