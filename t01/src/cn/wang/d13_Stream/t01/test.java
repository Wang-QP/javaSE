package cn.wang.d13_Stream.t01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xm");
        list.add("xh");
        list.add("xg");
        list.add("qp");
        list.stream().filter(name->name.startsWith("x")).forEach(name-> System.out.println(name));

        Stream.of(1,2,3,4,5).forEach(a-> System.out.println(a));
    }
}
