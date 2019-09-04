package cn.wang.d05.t05;

public class sort implements Comparable<sort>{
    private String name;
    private int age;

    public sort() {
    }

    public sort(String name, int age) {
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

    @Override
    public String toString() {
        return "sort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(sort o) {
        return this.age - o.age;
    }
}
