package cn.wang.d10_IO.t01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class pic_copy {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\pic.jpg");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("t01\\src\\cn\\wang\\d10_IO\\file\\pic.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
