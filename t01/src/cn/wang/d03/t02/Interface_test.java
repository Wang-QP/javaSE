package cn.wang.d03.t02;

public interface Interface_test {
    public static final int NUM = 10;

    public abstract void func();

    //默认方法
    public default void mofun(){
        System.out.println("默认方法");
        sifunc();
    }

    //静态方法
    public static void jingfunc(){
        System.out.println("静态方法直接通过接口名.静态方法名调用");
        jsfunc();
    }

    //普通私有方法
    private void sifunc(){
        System.out.println("私有方法只能本身默认调用");
    }

    //静态私有方法
    private static void jsfunc(){
        System.out.println("本身静态方法调用私有静态方法");
    }
}
