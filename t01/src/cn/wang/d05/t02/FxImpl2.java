package cn.wang.d05.t02;

public class FxImpl2<I> implements FxInterface<I>{
    @Override
    public void func(I i) {
        System.out.println(i);
    }
}
