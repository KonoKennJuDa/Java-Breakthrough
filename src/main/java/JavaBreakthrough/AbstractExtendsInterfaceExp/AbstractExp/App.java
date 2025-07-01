package JavaBreakthrough.AbstractExtendsInterfaceExp.AbstractExp;

public class App {

    public static void main(String[] args) {

        // Animal animal = new Animal(); мы не можем создавать абстрактный класс
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();

    }
}
