package cn.test.annotation;

//压制警告，基本使用"all"参数
@SuppressWarnings("all")
public class AnnoDemo1 {
    @Override
    public String toString() {
        return super.toString();
    }

    //标识过期
    @Deprecated
    public void show1(){}

    public void show2(){}

    public void func(){
        show1();
    }
}
