package cn.wang.d05.t01;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_test {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);

        boolean p;
        p = coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);

        p = coll.remove("王五");
        System.out.println(coll);

        //判断集合是否有某个元素
        p = coll.contains("李四");
        System.out.println(p);

        p = coll.isEmpty();
        System.out.println(p);

        int l = coll.size();
        System.out.println(l);

        //将集合转为数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //清空集合
        coll.clear();
        System.out.println(coll);
    }
}
