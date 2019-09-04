package cn.wang.d05.t01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_test {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");

        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(coll);
    }
}
