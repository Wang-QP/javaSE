package cn.wang.d05.t05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sort_test {
    public static void main(String[] args) {
        ArrayList<sort> list = new ArrayList<>();
        list.add(new sort("xm",18));
        list.add(new sort("xh",20));
        list.add(new sort("xg",19));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);



        ArrayList<Integer> w = new ArrayList<>();
        w.add(1);
        w.add(3);
        w.add(2);
        Collections.sort(w, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(w);
    }
}
