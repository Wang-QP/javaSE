package cn.wang.d06.t02;

import java.util.Scanner;

public class test {
    static String[] names = {"xm","xh","xg"};
    private static void Username(String name) throws Error {
        for (String s : names) {
            if(s.equals(name)){
                throw new Error("用户名已存在");
            }
        }
        System.out.println("注册成功");
    }

    private static void User(String name) throws TimeError {
        for (String s : names) {
            if(s.equals(name)){
                throw new TimeError("用户名已存在");
            }
        }
        System.out.println("注册成功");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        try {
            Username(name);
        } catch (Error error) {
            error.printStackTrace();
        }

        System.out.println("==========");
        User(name);
        System.out.println("运行时异常，交给JVM处理，直接结束");
    }
}
