package cn.wang.d08_Lambda.t03;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Person[] ps = {
                new Person("xm",18),
                new Person("xh",16),
                new Person("xg",17)
        };
//        Arrays.sort(ps, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        //使用lambda表达式
        Arrays.sort(ps, (Person o1, Person o2) -> {
                return o1.getAge()-o2.getAge();
            }
        );
        //可省略为
        Arrays.sort(ps, ( o1,  o2) -> o1.getAge()-o2.getAge());

        for (Person p : ps) {
            System.out.println(p);
        }
    }
}
