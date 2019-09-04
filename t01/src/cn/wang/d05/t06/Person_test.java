package cn.wang.d05.t06;

import java.util.HashMap;
import java.util.Map;

public class Person_test {
    public static void main(String[] args) {
        Map<String,Person> map = new HashMap<>();
        map.put("bj",new Person("xm",18));
        map.put("sh",new Person("xh",16));
        map.put("sz",new Person("xm",18));
        map.put("bj",new Person("xg",17));
        System.out.println(map);

        Map<Person,String> m = new HashMap<>();
        m.put(new Person("xm",18),"bj");
        m.put(new Person("xh",16),"sh");
        m.put(new Person("xm",18),"sz");
        m.put(new Person("xg",17),"bj");
        System.out.println(m);
    }
}
