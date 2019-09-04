package cn.wang.d04.t03;

public class ToString_test {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("s:"+s);
        StringBuilder bu = new StringBuilder(s);
        bu.append("world");
        System.out.println("bu:"+bu);
        s = bu.toString();
        System.out.println("s:"+s);
    }
}
