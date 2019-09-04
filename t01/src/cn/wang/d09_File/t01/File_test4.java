package cn.wang.d09_File.t01;

import java.io.File;
import java.io.IOException;

public class File_test4 {
    public static void main(String[] args) {
        show2();
        show1();
    }

    private static void show2() {
        File file = new File("E:\\Code\\Java\\test\\t01\\src\\cn\\wang\\d09_File\\file");
        file.mkdir();//创建文件夹
        File file1 = new File("E:\\Code\\Java\\test\\t01\\src\\cn\\wang\\d09_File\\file\\file");
        file1.mkdirs();//创建多级文件夹

        file1.delete();//删除文件、文件夹
    }

    private static void show1() {
        File file = new File("E:\\Code\\Java\\test\\t01\\src\\cn\\wang\\d09_File\\file\\1.txt");
        try {
            boolean flag = file.createNewFile();
            System.out.println(flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
