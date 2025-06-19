package JavaBreakthrough.ThisExp;

public class Human {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name; // this - указывает на переменную класса. Чтобы кампилятор отличал переменную класса от переменной метода
        // this - обращение к объекту внутри класса
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
