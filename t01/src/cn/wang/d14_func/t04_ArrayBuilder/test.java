package cn.wang.d14_func.t04_ArrayBuilder;

import java.lang.reflect.Array;

public class test {
    private static int[] func(int len,ArrayBuilder array){
        return array.builder(len);
    }
    public static void main(String[] args) {
        int[] arr1 = func(10,(len)->{
            return new int[len];
        });
        System.out.println(arr1.length);

        int[] arr2 = func(8,int[]::new);
        System.out.println(arr2.length);
    }
}
