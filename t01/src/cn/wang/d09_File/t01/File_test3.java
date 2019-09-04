package cn.wang.d09_File.t01;

import java.io.File;

public class File_test3 {
    public static void main(String[] args) {
        show1();
        show2();
    }

    private static void show1() {
        //判断路径是否存在
        File file1 = new File("E:\\Code\\Java\\test\\a.txt");
        System.out.println(file1.exists());
        File file2 = new File("E:\\Code\\Java\\test");
        System.out.println(file2.exists());
    }
    private static void show2() {
        File file1 = new File("E:\\Code\\Java\\test\\t01\\src\\cn\\wang\\d09_File\\t01\\File_test2.java");
        System.out.println(file1.isFile());//判断是否为文件
        System.out.println(file1.isDirectory());//判断是否为目录
        File file2 = new File("E:\\Code\\Java\\test");
        System.out.println(file2.isFile());
    }
}
