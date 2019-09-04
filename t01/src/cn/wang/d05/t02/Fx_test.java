package cn.wang.d05.t02;


import java.util.ArrayList;
import java.util.Iterator;

public class Fx_test {
    public static void main(String[] args) {
        FxImpl1 fx = new FxImpl1();
        fx.func("第一种方法");

        FxImpl2<String> fx2 = new FxImpl2<>();
        fx2.func("第二种方法");
        f();
    }

    private static void f() {
        ArrayList<String> s = new ArrayList<>();
        s.add("aaa");
        s.add("bbb");

        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);

        print(i);
        print(s);
    }

    private static void print(ArrayList<?> list) {
        for (Iterator<?> it = list.iterator();it.hasNext()==true;) {
            System.out.println(it.next());
        }
    }
}
