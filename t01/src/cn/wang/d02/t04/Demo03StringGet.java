package cn.wang.d02.t04;

public class Demo03StringGet {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "Ab";
        System.out.println(s1.length());

        //拼接
        System.out.println(s1.concat(s2));

        System.out.println(s1.charAt(2));

        System.out.println(s1.indexOf('b'));

        String s3 = s1.substring(0,2);
        System.out.println(s3);
    }
}
