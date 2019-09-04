package cn.wang.d03.t03;

public class Duotai_test {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
        obj.func();
//        obj.fun() //报错
        if(obj instanceof Zi){
            Zi zi = (Zi) obj;
            zi.fun();
        }

    }
}
