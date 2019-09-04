package cn.wang.d02.t05;

public class Math_test {
    public static void main(String[] args) {
        double a = -2.3;
        a = Math.abs(a);
        System.out.println(a);

        a = Math.ceil(a);
        System.out.println(a);

        a = 2.8;
        a = Math.floor(a);
        System.out.println(a);

        a = 4.4;
        a = Math.round(a);
        System.out.println(a);


        System.out.println(Math.PI);
    }
}
