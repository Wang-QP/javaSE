package cn.wang.d02.t02;

public class Class_Array {
    public static void main(String[] args) {
        Person[] array = new Person[2];

        Person one = new Person("xiaoming",18);
        Person two = new Person("xiaohong",16);

        array[0] = one;
        array[1] = two;

        System.out.println(array[1].getName());
    }
}
