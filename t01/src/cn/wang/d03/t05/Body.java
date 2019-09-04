package cn.wang.d03.t05;

public class Body {
    class Heart {
        private int num = 20;
        public void func(){
            int num = 10;
            System.out.println("内部类方法");
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }
    }

    private int num = 30;
    public void func(){
        System.out.println("外部类方法");
        new Heart().func();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
