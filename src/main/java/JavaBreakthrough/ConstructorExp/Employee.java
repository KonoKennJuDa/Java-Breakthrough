package JavaBreakthrough.ConstructorExp;

public class Employee {

    private String name;
    private int age;

    // Перегрузка методов. Метод с одним названием, но разной сигнатурой/параметрами.
    // Java понимает, какой метод использовать судя по тем параметрам, которые мы передаем, при вызове метода
    public Employee() {
        System.out.println("Привет из первого конструктора");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Employee(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Employee(String name, int age) {
        System.out.println("Привет из третьего конструктора");
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

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
