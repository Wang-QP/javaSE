package cn.wang.d09_File.t01;

import java.io.File;

public class File_test6 {
    public static void main(String[] args) {
        File file = new File("E:\\Code\\Java\\test\\t01\\src");
        show(file);
    }
    public static void show(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
            if (f.isDirectory()){
                show(f);
            }
        }
    }
}
