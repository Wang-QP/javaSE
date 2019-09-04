package cn.wang.d04.t01;

public class Equals_test {
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Equals_test)
        {
            Equals_test equals_test = (Equals_test)obj;
            if (equals_test.age == this.age && this.name.equals(equals_test.name))
                return true;
        }

        return false;
    }

    public Equals_test() {
    }

    public Equals_test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
