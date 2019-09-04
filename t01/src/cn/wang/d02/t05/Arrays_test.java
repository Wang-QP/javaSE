package cn.wang.d02.t05;

import java.util.Arrays;

public class Arrays_test {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        String s = Arrays.toString(a);
        System.out.println(s);

        int[] b = {4,3,5,1,2};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
