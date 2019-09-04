package cn.wang.d02.t04;

public class Demo01String {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] arraychar = {'A','B','C'};
        String s2 = new String(arraychar);
        System.out.println(s2);

        byte[] bytes = {97,98,99};
        String s3 = new String(bytes);
        System.out.println(s3);

        String ss1 = "Hello";
        System.out.println(ss1);
    }
}
