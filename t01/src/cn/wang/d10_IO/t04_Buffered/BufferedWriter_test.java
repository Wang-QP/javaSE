package cn.wang.d10_IO.t04_Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("t01\\src\\cn\\wang\\d10_IO\\file\\bw.txt",true));
        for (int i = 0; i < 10; i++) {
            bw.write("你好");
            bw.newLine();//换行（不区分操作系统）
        }
        bw.flush();
        bw.close();
    }
}
