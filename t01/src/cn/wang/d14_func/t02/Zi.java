package cn.wang.d14_func.t02;

public class Zi extends Fu{
    public void func(Show show){
        show.Show();
    }
    public void show1(){
        System.out.println("this引用本类的成员方法");
    }
    public void show(){
        func(super::show);
        func(this::show1);
    }
    public static void main(String[] args) {
        new Zi().show();
    }
}
