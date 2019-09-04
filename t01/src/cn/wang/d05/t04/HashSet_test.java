package cn.wang.d05.t04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_test {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);

        for(Iterator<Integer> it = set.iterator();it.hasNext();){
            System.out.println(it.next().hashCode());
        }
    }
}
