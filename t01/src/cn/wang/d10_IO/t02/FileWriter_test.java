package cn.wang.d10_IO.t02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_test {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("t01\\src\\cn\\wang\\d10_IO\\file\\b.txt");
//        FileWriter fw = new FileWriter("t01\\src\\cn\\wang\\d10_IO\\file\\b.txt",true);//续写
        char[] chars = {'你','好'};
        fw.write(chars);
        fw.flush();
        fw.close();
    }
}
