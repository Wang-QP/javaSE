package cn.test.reflect;

import cn.test.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class cls = Person.class;

        //获取所有public成员方法
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("---------------");
        Method eat_method1 = cls.getMethod("eat");
        System.out.println(eat_method1);

        //执行方法
        Person p = new Person();
        eat_method1.invoke(p);

        Method eat_method2 = cls.getMethod("eat", String.class);
        eat_method2.invoke(p,"饭");

        System.out.println("---------------");
        //获取所有成员方法
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);

            //获取方法名
            String name = declaredMethod.getName();
            System.out.println(name);
        }


        //获取类名
        String name = cls.getName();
        System.out.println(name);
    }
}
