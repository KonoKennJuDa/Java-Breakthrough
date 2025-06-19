package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class Animal {

    // Это родительский, общий класс, от которого будут наследоваться другие
    // При наследовании они наследуют переменные и методы

    String name;
    int age;

    public void eat() {
        System.out.println("Я кушаю");
    }

    public void sleep () {
        System.out.println("Z-z-z");
    }

    public void speak () {
        System.out.println("Я разговариваю");
    }
}
