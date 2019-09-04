package cn.wang.d03.t04;

public class Computer {
    public void com_open(){
        System.out.println("open computer");
    }
    public void com_close(){
        System.out.println("close computer");
    }

    public void use(USB u){
        u.open();
        if (u instanceof Mouse){
            Mouse m = (Mouse)u;
            m.click();
        }
        if (u instanceof KeyBoard){
            KeyBoard k = (KeyBoard)u;
            k.type();
        }
        u.close();
    }
}
