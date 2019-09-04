package cn.test.reflect;

import cn.test.domain.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //1 Class.forName("全类名")
        Class cls1 = Class.forName("cn.test.domain.Person");
        System.out.println(cls1);

        //2 类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3 对象.getclass()
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);
    }
}
