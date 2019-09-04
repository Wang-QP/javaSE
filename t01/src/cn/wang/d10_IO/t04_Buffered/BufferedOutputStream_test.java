package cn.wang.d10_IO.t04_Buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("t01\\src\\cn\\wang\\d10_IO\\file\\bos.txt");
        BufferedOutputStream bfs = new BufferedOutputStream(fos);
        bfs.write("写入数据".getBytes());
        bfs.flush();
        bfs.close();

    }
}
