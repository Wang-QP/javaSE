package cn.wang.d12_lambda.t04_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_test {
    public static void main(String[] args) {
        String[] arr = {"xm,m","xh,w","xg,m","xxx,w"};
        ArrayList<String> list = func(arr,message-> message.split(",")[0].length()>2,
                message->message.split(",")[1].equals("w"));
        for (String message : list) {
            System.out.println(message);
        }
    }
    private static ArrayList<String> func(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String message : arr) {
            boolean p = pre1.negate().and(pre2).test(message);
            if (p){
                list.add(message);
            }
        }
        return list;
    }
}
