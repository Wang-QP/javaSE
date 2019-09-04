package cn.wang.d05.t06;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class of_test {
    //of生成后不可再添加
    //set,map不能重复元素
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "a");
        System.out.println(list);

        Set<String> set = Set.of("a", "b", "c");
        System.out.println(set);

        Map<Object, Object> map = Map.of("xm",18,"xh",16,"xg",17);
        System.out.println(map);
    }
}
