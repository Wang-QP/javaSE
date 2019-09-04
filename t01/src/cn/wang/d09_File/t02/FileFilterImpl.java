package cn.wang.d09_File.t02;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        String file = pathname.getName();
        if(file.toLowerCase().endsWith(".java")){
            return true;
        }
        return false;
    }
}
