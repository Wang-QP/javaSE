package cn.wang.d01.t02;

public class Student_test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("xiaoming");
        student.setAge(18);
        student.setSex(true);

        student.sayHello("xiaohong");

        Student student1 = new Student("xiaohong", 18, true);
        System.out.println(student1.getName());
    }
}
