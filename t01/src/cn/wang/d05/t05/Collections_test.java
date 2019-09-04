package cn.wang.d05.t05;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        Collections.addAll(str,"a","b","c","d");
        System.out.println(str);

        Collections.shuffle(str);
        System.out.println(str);

        Collections.sort(str);
        System.out.println(str);
    }
}
