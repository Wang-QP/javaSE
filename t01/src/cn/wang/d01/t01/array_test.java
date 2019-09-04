package cn.wang.d01.t01;

import java.util.Scanner;

public class array_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = a;
        for (int i : a){
            System.out.println(i);
        }
        System.out.println(a);
        System.out.println(b);
        a[1] = 0;
        System.out.println(b[1]);
        String[] s = new String[5];
        for (int i = 0; i < 5; i++) {
//            a[i] = input.nextInt();
            System.out.println(a[i]);
            s[i] = "abc";
            System.out.println(s[i].charAt(2));
        }
        System.out.println(a);
        System.out.println(s);
    }
    public static int[] sum (int a,int b){
        int s[] = {a,b};
        return s;
    }
}
