package cn.wang.d05.t06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class keyset_test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("xm",18);
        map.put("xh",16);
        map.put("xg",17);

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entries) {
            System.out.println(stringIntegerEntry.getKey());
            System.out.println(stringIntegerEntry.getValue());
        }


        for (Iterator<Map.Entry<String, Integer>> it = entries.iterator();it.hasNext();){
            Map.Entry<String, Integer> ky = it.next();
            System.out.println(ky.getKey()+ky.getValue());
        }
    }
}
