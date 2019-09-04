package cn.wang.d05.t04;

import java.util.LinkedList;

public class LinkedList_test {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();

        linked.addFirst("a");
        linked.push("c");

        linked.addFirst("b");
        linked.add("d");
        System.out.println(linked);

        if(!linked.isEmpty()){
            String first = linked.getFirst();
            String last = linked.getLast();
        }

        String first = linked.removeFirst();
        first = linked.pop();
        String last = linked.removeLast();

        linked.clear();
    }
}
