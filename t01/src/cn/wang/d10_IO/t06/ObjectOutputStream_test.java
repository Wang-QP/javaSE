package cn.wang.d10_IO.t06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_test {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("t01\\src\\cn\\wang\\d10_IO\\file\\xlh.txt"));
        oos.writeObject(new Person("xm",18));
        oos.close();
    }
}
