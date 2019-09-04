package cn.wang.d05.t04;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_test {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = "www";
        String s2 = "abc";
        String s3 = "abc";
        String s4 = "qwp";
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);

        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add(s1);
        lset.add(s2);
        lset.add(s3);
        lset.add(s4);
        System.out.println(lset);
    }
}
