package cn.wang.d12_lambda.t05_Function;

import java.util.function.Function;

public class Function_test {
    public static void main(String[] args) {
        String s = "123";
        func(s,s1 -> Integer.parseInt(s1)+10,a->a+"");
    }
    private static void func(String s, Function<String,Integer> func1,Function<Integer,String> func2){
        String ss = func1.andThen(func2).apply(s);
        System.out.println(ss);
    }
}
