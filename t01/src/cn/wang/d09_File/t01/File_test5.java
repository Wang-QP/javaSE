package cn.wang.d09_File.t01;

import java.io.File;

public class File_test5 {
    public static void main(String[] args) {
        File file = new File("E:\\Code\\Java\\test\\t01\\src\\cn\\wang");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }


        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.toString());
        }
    }
}
