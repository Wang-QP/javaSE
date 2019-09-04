package cn.wang.d02.t04;

public class Demo04StringConvert {
    public static void main(String[] args) {
        String s1 = "abcdef";
        char[] chars = s1.toCharArray();
        System.out.println(chars);
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String s2 = s1.replace("bc","BC");
        System.out.println(s2);
    }
}
