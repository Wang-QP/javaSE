package cn.wang.d04.t02;

public class System_test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,0};
        System.arraycopy(a,0,b,0,3);
        for (int i:b){
            System.out.println(i);
        }
    }
}
