package cn.wang.d05.t04;

import java.util.ArrayList;
import java.util.List;

public class List_test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add(1,"3");
        System.out.println(list);

        String s = list.remove(2);
        System.out.println(s);
        System.out.println(list);

        list.set(1,"q");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
