package cn.wang.d05.t06;

import java.util.HashMap;
import java.util.Map;

public class Map_test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        Integer v = map.put("xiaoming",173);
        System.out.println(v);
        v = map.put("xiaoming",175);
        System.out.println(v);

        v = map.get("xiaoming");
        System.out.println(v);

        v = map.remove("xiaoming");
        System.out.println(v);

        boolean p = map.containsKey("xiaoming");
        System.out.println(p);
    }
}
