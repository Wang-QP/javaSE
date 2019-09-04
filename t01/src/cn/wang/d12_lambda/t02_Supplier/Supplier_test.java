package cn.wang.d12_lambda.t02_Supplier;

import java.util.function.Supplier;

public class Supplier_test {
    public static void main(String[] args) {
        String str = getstr(()-> "xm");
        System.out.println(str);
    }
    public static String getstr(Supplier<String> sup){
        return sup.get();
    }
}
