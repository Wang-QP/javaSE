package cn.wang.d04.t03;

public class StringBuilder_test {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        System.out.println("s1:"+s1);

        StringBuilder s2 = new StringBuilder("abc");
        s2.append(1);//可以添加任意类型
        System.out.println("s2:"+s2);
    }
}
