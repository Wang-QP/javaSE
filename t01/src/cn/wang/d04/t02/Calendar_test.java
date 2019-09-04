package cn.wang.d04.t02;

import java.util.Calendar;

public class Calendar_test {
    public static void main(String[] args) {
        func1();
        func2();
    }

    private static void func2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2019);
        calendar.add(Calendar.YEAR,5);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        calendar.set(2019,7,10);
        System.out.println(calendar.getTime());
    }

    private static void func1() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int mday = calendar.get(Calendar.DAY_OF_MONTH);
        int wday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
    }
}
