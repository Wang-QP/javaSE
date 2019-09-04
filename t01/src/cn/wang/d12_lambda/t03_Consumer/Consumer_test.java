package cn.wang.d12_lambda.t03_Consumer;

import java.util.function.Consumer;

public class Consumer_test {
    public static void main(String[] args) {
        String[] arr = {"xm,m","xh,w","xg,m"};
        func(arr,(message)->{
            System.out.print("name:"+message.split(",")[0]);
        },(message)->{
            System.out.println(".sex:"+message.split(",")[1]);
        });
    }
    private static void func(String[] arr,Consumer<String> con1,Consumer<String> con2){
        for (String message : arr) {
//            con1.accept(message);
//            con2.accept(message);
            con1.andThen(con2).accept(message);
        }
    }
}
