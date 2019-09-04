package cn.wang.d04.t04;

public class test {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        System.out.println(a);
        a = Integer.valueOf("15");
        System.out.println(a);
        int b = a.intValue();
        System.out.println(b);
    }
}
