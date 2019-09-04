package cn.wang.d10_IO.t03_Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class test2 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("xm","18");
        p.setProperty("xh","16");
        p.setProperty("xg","17");

        FileWriter fw = new FileWriter("t01\\src\\cn\\wang\\d10_IO\\file\\prop.txt");
        p.store(fw,"write data");
    }
}
