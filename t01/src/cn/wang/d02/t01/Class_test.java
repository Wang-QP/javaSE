package cn.wang.d02.t01;

import java.util.Scanner;

public class Class_test {
    public static void main(String[] args) {
        test(return_test());
    }
    public static void test(Scanner input){
        int a = input.nextInt();
        System.out.println(a);
    }
    public static Scanner return_test(){
        return new Scanner(System.in);
    }
}
