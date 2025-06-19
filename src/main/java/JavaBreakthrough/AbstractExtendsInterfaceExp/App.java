package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.speak();

        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.speak();

        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.speak();
    }


}
