package cn.wang.d05.t02;

public class fanxing_test {
    public static void main(String[] args) {
        fanxing<String> fx = new fanxing<>();
        fx.setName("xiaoming");
        System.out.println(fx.getName());

        fx.func(1);
    }
}
