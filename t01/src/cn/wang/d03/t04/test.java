package cn.wang.d03.t04;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.com_open();
        USB usbmouse = new Mouse();
        computer.use(usbmouse);

        KeyBoard keyBoard = new KeyBoard();
        computer.use(keyBoard);
        computer.com_close();
    }
}
