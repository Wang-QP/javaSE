package cn.wang.d12_lambda.t01;

import java.util.Arrays;
import java.util.Comparator;

public class sort_lambda {
    public static void main(String[] args) {
        String[] arr = {"aaa","bb","c","dddd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, func());
        System.out.println(Arrays.toString(arr));
    }
    public static Comparator<String> func(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
        return ((o1, o2) -> o1.length()-o2.length());
    }
}
