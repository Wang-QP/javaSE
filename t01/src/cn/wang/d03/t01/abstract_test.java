package cn.wang.d03.t01;

abstract class Animal{
    public Animal() {
        System.out.println("抽象父类构造方法");
    }
    public abstract void eat();
}

class Cat extends Animal{
    public Cat() {
        System.out.println("子类构造方法");
    }
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}

public class abstract_test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}
