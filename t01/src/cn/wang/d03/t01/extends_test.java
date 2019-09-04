package cn.wang.d03.t01;

class Fu{
    private String name;
    private int no;

    public Fu() {
    }

    public Fu(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public void func(){
        System.out.println("父类中的方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}

class Zi extends Fu{
    public Zi() {
    }

    public Zi(String name, int no) {
        super(name, no);
    }

    @Override
    public void func(){
        super.func();
        System.out.println("子类中的方法");
    }
}

public class extends_test {
    public static void main(String[] args) {
        Zi zi = new Zi("xiaoming",10001);
        System.out.println(zi.getName()+zi.getNo());
        zi.func();
    }
}
