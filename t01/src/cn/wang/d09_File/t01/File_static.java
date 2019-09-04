package cn.wang.d09_File.t01;

import java.io.File;

public class File_static {
    public static void main(String[] args) {
        String sa = File.pathSeparator;//win ;  linux :
        Character a = File.pathSeparatorChar;//win ;  linux :
        String sb = File.separator;//win \   linux  /
        Character b = File.separatorChar;//win \   linux  /
        System.out.println(a+""+b);
        System.out.println(sa+sb);
    }
}
