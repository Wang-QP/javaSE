package cn.wang.d09_File.t01;

import java.io.File;

public class File_test2 {
    public static void main(String[] args) {
        show1();
        show2();
        show3();
    }

    private static void show3() {
        //获取文件的大小（字节）
        File file = new File("E:\\Code\\Java\\test\\t01\\src\\cn\\wang\\d09_File\\t01\\File_test2.java");
        System.out.println(file.length());
    }

    private static void show2() {
        //获取给定路径的结尾
        File file1 = new File("E:\\Code\\Java\\test\\a.txt");
        System.out.println(file1.getName());
        File file2 = new File("E:\\Code\\Java\\test");
        System.out.println(file2.getName());
    }

    private static void show1() {
        //获取绝对路径
        File file1 = new File("E:\\Code\\Java\\test\\a.txt");
        System.out.println(file1.getAbsolutePath());
        File file2 = new File("a.txt");
        System.out.println(file2.getAbsolutePath());
        //获取给定路径
        System.out.println(file2.getPath());
        //toString()调用的是getPath()
        System.out.println(file2.toString());
    }
}
