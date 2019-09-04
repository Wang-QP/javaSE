package cn.wang.d09_File.t02;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter_test {
    public static void main(String[] args) {
        File file = new File("E:\\Code\\Java\\test\\t01\\src");
        func(file);
    }
    public static void func(File file){
//        File[] files = file.listFiles(new FileFilterImpl());
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });
        for (File f : files) {
            if (f.isDirectory()){
                func(f);
            }else {
                System.out.println(f);
            }
        }
    }
}
