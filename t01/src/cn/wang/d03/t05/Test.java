package cn.wang.d03.t05;

public class Test {
    public static void main(String[] args) {
        Body body = new Body();
        body.func();

        Body.Heart heart = new Body().new Heart();
        heart.func();
    }
}
