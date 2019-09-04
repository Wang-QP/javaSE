package cn.wang.d05.t03;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;

public class Doudizhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] type = {"♠","♥","♣","♦"};
        String[] num = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String n : num) {
            for (String t : type) {
                poker.add(t+n);
            }
        }
//        System.out.println(poker);
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();
        Collections.shuffle(poker);
        for (int i = 0; i < poker.size(); i++) {
            if(i>=51){
                dp.add(poker.get(i));
            }else if(i%3==1){
                p1.add(poker.get(i));
            }else if(i%3==2){
                p2.add(poker.get(i));
            }else {
                p3.add(poker.get(i));
            }
        }
        System.out.println("玩家1："+p1);
        System.out.println("玩家2："+p2);
        System.out.println("玩家3："+p3);
        System.out.println("底牌："+dp);
    }
}
