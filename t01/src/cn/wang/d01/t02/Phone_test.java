package cn.wang.d01.t02;

public class Phone_test {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.name);
        System.out.println(phone.price);
        phone.name = "iphone";
        phone.price = 8000;
        System.out.println(phone.name);
        System.out.println(phone.price);

        Phone phone1 = phone;
        System.out.println(phone1.name);
        System.out.println(phone1.price);
        phone1.name = "sunson";
        System.out.println(phone1.name);
        System.out.println(phone.name);
    }
}
