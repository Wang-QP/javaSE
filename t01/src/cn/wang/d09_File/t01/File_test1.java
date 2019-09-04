package cn.wang.d09_File.t01;

import java.io.File;

public class File_test1 {
    public static void main(String[] args) {
        show1();
        show2();
        show3();
    }

    private static void show3() {
        File f = new File("c:\\");
        File file = new File(f,"a.txt");
        System.out.println(file);
    }

    private static void show2() {
        File file = new File("c:\\","a.txt");
        System.out.println(file);
    }

    private static void show1() {
        File file = new File("E:\\Code\\Java\\test");
        System.out.println(file);
    }
}
