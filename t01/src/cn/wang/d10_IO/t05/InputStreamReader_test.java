package cn.wang.d10_IO.t05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("t01\\src\\cn\\wang\\d10_IO\\file\\gbk.txt"),"GBK");
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.println((char) len);
        }
        isr.close();
    }
}
