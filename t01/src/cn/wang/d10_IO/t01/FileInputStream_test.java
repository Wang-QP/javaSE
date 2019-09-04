package cn.wang.d10_IO.t01;


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_test {
    public static void main(String[] args) throws IOException {
        read1();
        read2();
    }

    private static void read2() throws IOException {
        FileInputStream fis = new FileInputStream("t01\\src\\cn\\wang\\d10_IO\\file\\a.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }

    private static void read1() throws IOException{
        FileInputStream fis = new FileInputStream("t01\\src\\cn\\wang\\d10_IO\\file\\a.txt");
//        int len = fis.read();
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.print((char)len);
        }
        fis.close();
    }
}
