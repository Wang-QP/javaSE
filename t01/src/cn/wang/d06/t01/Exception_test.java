package cn.wang.d06.t01;

import java.io.IOException;

public class Exception_test {

    public static void main(String[] args) {
        func1(1,1);
        try {
            func2("a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("......");
    }
    //运行时异常
    private static void func1(int a,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("00000");
        }
        System.out.println(a*1.0/b);
    }
    //编译时异常
    private static void func2(String str) throws IOException {
        if(!str.endsWith("txt")){
            throw new IOException("File");
        }
        System.out.println(str);
    }
}
