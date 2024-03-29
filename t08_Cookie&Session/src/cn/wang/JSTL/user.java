package cn.wang.JSTL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class user {
    private String name;
    private int age;
    private Date date;

    public user() {
    }

    public user(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getBriday(){
        if (date != null) {
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd").format(date);
            return time;
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
