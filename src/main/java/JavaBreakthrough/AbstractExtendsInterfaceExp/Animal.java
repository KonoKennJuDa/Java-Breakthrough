package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class Animal {

    // Это родительский, общий класс, от которого будут наследоваться другие
    // При наследовании они наследуют переменные и методы

    String name;
    int age;

    public void eat() {
        System.out.println("Я кушаю");
    }

    public void sleep() {
        System.out.println("Z-z-z");
    }

    public void speak() {
        System.out.println("Я разговариваю");
    }

    // Вообще я тут переназначил, и теперь Cat и Dog тоже имеются этот метод и его не надо у них переопределять
    @Override
    public String toString() {
        return name + ", " + age;
    }

}
