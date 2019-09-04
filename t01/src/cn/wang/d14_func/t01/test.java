package cn.wang.d14_func.t01;

public class test {
    private static void func(Print p){
        p.print("hello");
    }
    public static void main(String[] args) {
        Obj obj = new Obj();
        func(obj::func);
//        func(Print::f);//静态方法用类名引用

//        func(s -> {
//            Obj obj1 = new Obj();
//            obj1.func(s);
//        });
    }
}
