package cn.test.reflect;

import cn.test.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class cls = Person.class;

        //获取所有public修饰的成员变量
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------------");
        //获取指定的public成员变量
        Field a = cls.getField("a");
        Person p = new Person();
        a.set(p,5);
        Object o = a.get(p);
        System.out.println(o);

        System.out.println("--------------");
        //获取所有成员变量
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("--------------");
        //获取指定的成员变量
        Field d = cls.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        d.set(p,3);
        Object o1 = d.get(p);
        System.out.println(o1);
    }
}
