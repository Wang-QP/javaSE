package cn.wang.d10_IO.t01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_test {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {65,66,67,68,69};
        FileOutputStream fos = new FileOutputStream("E:\\Code\\Java\\test\\t01\\src\\cn\\wang\\d10_IO\\file\\a.txt");
//      FileOutputStream fos = new FileOutputStream("a.txt",true);//追加写
        fos.write(97);
        fos.write(bytes);
        fos.write(bytes,0,3);
        fos.write("\r\n".getBytes());
        fos.write("你好".getBytes());
        fos.close();
    }
}
