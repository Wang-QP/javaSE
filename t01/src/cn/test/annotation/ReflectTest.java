package cn.test.annotation;

import java.lang.reflect.Method;

@Pro(className = "cn.test.domain.Student",methodName = "sleep")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类，执行任意对象

        //1.解析注释
        //1.1获取该类的字节文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上面的注释对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注释对象的抽象方法，获得返回值
        String className = an.className();
        String methodName = an.methodName();

        System.out.println(className);
        System.out.println(methodName);

        //3.加载该类进内存
        Class cls = Class.forName(className);

        //4.创建对象
        Object obj = cls.newInstance();

        //5.获取方法对象
        Method method = cls.getMethod(methodName);

        //6.执行方法
        method.invoke(obj);
    }
}
