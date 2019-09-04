package cn.test.domain;

public class Person {
    private String name;
    private int age;

    public int a;
    protected int b;
    int c;
    private int d;

    public void eat(){
        System.out.println("eat...");
    }
    public void eat(String str){
        System.out.println("eat..."+str);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
