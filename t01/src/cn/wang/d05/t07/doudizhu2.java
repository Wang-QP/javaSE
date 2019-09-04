package cn.wang.d05.t07;

import java.util.*;

public class doudizhu2 {
    public static void main(String[] args) {
        Map<Integer,String> poker = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<String> color = List.of("♠","♥","♣","♦");
        List<String> number = List.of("2","A","K","Q","J","10","9","8","7","6","5","4","3");
        int index = 0;
        poker.put(index++,"大王");
        poker.put(index++,"小王");
        for (String n : number) {
            for (String c : color) {
                poker.put(index++,c+n);
            }
        }

        Set<Integer> integerSet = poker.keySet();
        for (Integer integer : integerSet) {
            list.add(integer);
        }
        Collections.shuffle(list);

        List<Integer> p1 = new ArrayList<>();
        List<Integer> p2 = new ArrayList<>();
        List<Integer> p3 = new ArrayList<>();
        List<Integer> dp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i>=51){
                dp.add(list.get(i));
            }else if(i%3==0){
                p1.add(list.get(i));
            }else if(i%3==1){
                p2.add(list.get(i));
            }else{
                p3.add(list.get(i));
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);

        print("玩家1：",p1,poker);
        print("玩家2：",p2,poker);
        print("玩家3：",p3,poker);
        print("底牌：",dp,poker);
    }

    private static void print(String name,List<Integer> list,Map<Integer,String> poker) {
        System.out.print(name);
        for (Integer integer : list) {
            System.out.print(poker.get(integer)+" ");
        }
        System.out.println();
    }
}
