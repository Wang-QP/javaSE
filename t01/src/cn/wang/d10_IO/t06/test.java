package cn.wang.d10_IO.t06;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add(new Person("xm",18));
        arr.add(new Person("xh",16));
        arr.add(new Person("xg",17));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("t01\\src\\cn\\wang\\d10_IO\\file\\xlh_test.txt"));
        oos.writeObject(arr);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t01\\src\\cn\\wang\\d10_IO\\file\\xlh_test.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
