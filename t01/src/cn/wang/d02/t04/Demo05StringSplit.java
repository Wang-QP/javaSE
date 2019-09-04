package cn.wang.d02.t04;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String s1 = "aaa,bbb,ccc";
        String[] s = s1.split(",");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        String s2 = "aaa.bbb.ccc";
        String[] ss = s2.split("\\."); //通过正则表达式切分，"."会报错
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
