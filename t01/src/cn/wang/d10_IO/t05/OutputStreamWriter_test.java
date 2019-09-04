package cn.wang.d10_IO.t05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_test {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("t01\\src\\cn\\wang\\d10_IO\\file\\gbk.txt"), "GBK");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
