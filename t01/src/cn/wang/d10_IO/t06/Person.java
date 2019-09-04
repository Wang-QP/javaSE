package cn.wang.d10_IO.t06;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 42L;//防止序列号冲突
    private String name;
    //transient 瞬态关键字，不能被序列号
    private /*transient*/ int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
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
