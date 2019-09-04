package cn.wang.d10_IO.t02;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("t01\\src\\cn\\wang\\d10_IO\\file\\a.txt");
        int len = 0;
        while((len = fr.read())!=-1){
            System.out.print((char) len);
        }
        fr.close();
    }
}
