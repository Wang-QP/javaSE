package cn.wang.d04.t01;

public class ToString_test {
    private String name;
    private int age;

    public ToString_test() {
    }

    @Override
    public String toString() {
        return "ToString_test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public ToString_test(String name, int age) {
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
