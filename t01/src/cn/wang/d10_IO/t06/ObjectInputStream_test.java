package cn.wang.d10_IO.t06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t01\\src\\cn\\wang\\d10_IO\\file\\xlh.txt"));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
    }
}
