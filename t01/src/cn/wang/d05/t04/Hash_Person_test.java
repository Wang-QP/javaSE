package cn.wang.d05.t04;

import java.util.HashSet;

public class Hash_Person_test {
    public static void main(String[] args) {
        HashSet<Hash_Person> set = new HashSet<>();
        Hash_Person p1 = new Hash_Person("xiaoming",18);
        Hash_Person p2 = new Hash_Person("xiaoming",18);
        Hash_Person p3 = new Hash_Person("xiaoming",19);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);
    }
}
