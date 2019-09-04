package cn.wang.d10_IO.t07_PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream_test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("t01\\src\\cn\\wang\\d10_IO\\file\\print.txt");
        ps.write(97);//使用编码表
        ps.println(97);
        ps.println("a");
        ps.println("helloworld");
        ps.println(true);


        System.out.println("控制台打印");
        System.setOut(ps);//设置打印的路径
        System.out.println("打印流打印");
    }
}
