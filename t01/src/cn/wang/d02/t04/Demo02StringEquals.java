package cn.wang.d02.t04;

public class Demo02StringEquals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        char[] chars = {'a','b','c'};
        String s3 = new String(chars);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));

        System.out.println("abc".equals(s3));

        System.out.println("aBc".equalsIgnoreCase(s3));
    }
}
