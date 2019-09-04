package cn.wang.d14_func.t03_classbuilder;

public class test {
    private static Person builder(String name,PersonBuilder person){
        return person.builderperson(name);
    }
    public static void main(String[] args) {
        Person person = builder("xm",Person::new);
        System.out.println(person);
    }
}
