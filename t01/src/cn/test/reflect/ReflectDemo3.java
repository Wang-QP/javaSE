package cn.test.reflect;

import cn.test.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class cls = Person.class;

        //获取构造方法
        Constructor constructor = cls.getConstructor(String.class,int.class);
        System.out.println(constructor);
        Object xm = constructor.newInstance("xm", 18);
        System.out.println(xm);


        Object o = cls.newInstance();
        System.out.println(o);
    }
}
