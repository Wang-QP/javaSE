package cn.wang.d10_IO.t04_Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("t01\\src\\cn\\wang\\d10_IO\\file\\bw.txt"));
        String str = null;
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
    }
}
