package cn.wang.d13_Stream.t02;

import java.util.Arrays;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        Stream<Integer> ins = Stream.of(1, 2, 3, 4, 5);
        ins.map(i -> i+"a").forEach(s -> System.out.println(s));

        long count = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println("长度："+count);

        String[] strs = {"xm","xh","xg"};
        Stream<String> strs1 = Stream.of(strs);
        //取前n个元素
        strs1.limit(2).forEach(s -> System.out.println(s));
        System.out.println(Arrays.toString(strs));

        Stream<String> strs2 = Stream.of(strs);
        //跳过前n个元素
        strs2.skip(1).forEach(s -> System.out.println(s));


        String[] ss = {"1","2","3"};
        Stream<String> strs3 = Stream.of(strs);
        Stream<String> strs4 = Stream.of(ss);
        //合并两个流
        Stream.concat(strs3,strs4).forEach(s -> System.out.println(s));
    }
}
