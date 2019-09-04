package cn.wang.d02.t03;

import java.util.ArrayList;

public class Demo01_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);


        boolean p = list.add("xiaoming");
        System.out.println(p);
        System.out.println(list);
        String name = list.get(0);
        System.out.println(name);
        String rname = list.remove(0);
        System.out.println(rname);
        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
