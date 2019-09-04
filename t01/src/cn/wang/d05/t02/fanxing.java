package cn.wang.d05.t02;

public class fanxing<E> {
    private E name;

    public <E> void func(E e){
        System.out.println(e);
    }

    public fanxing(E name) {
        this.name = name;
    }

    public fanxing() {
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
