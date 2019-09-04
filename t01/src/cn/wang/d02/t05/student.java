package cn.wang.d02.t05;

public class student {
    private String name;
    private int age;
    public static String room;

    static {
        System.out.println("静态代码块只有在第一次执行类时调用");
    }

    public static void func(){
        System.out.println(room);
    }

    public student() {
        System.out.println("构造方法执行");
    }

    public student(String name, int age) {
        System.out.println("构造方法执行");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
