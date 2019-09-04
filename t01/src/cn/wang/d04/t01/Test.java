package cn.wang.d04.t01;

public class Test {
    public static void main(String[] args) {
        Equals_test e1 = new Equals_test("xiaoming",18);
        Equals_test e2 = new Equals_test("xiaoming",18);
        System.out.println(e1.equals(e2));
    }
}
