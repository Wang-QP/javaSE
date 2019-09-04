package cn.wang.d04.t02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_test {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()== new Date().getTime());

        Date date = new Date();
        System.out.println(date);
        date = new Date(1562730026420L);
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        try {
            System.out.println(sdf.parse("2019-07-10 11:40:26"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
