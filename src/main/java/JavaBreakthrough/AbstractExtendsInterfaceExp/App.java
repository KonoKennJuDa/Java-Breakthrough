package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.speak();

        System.out.println();

        Dog dog = new Dog("Max", 4);
        dog.eat();
        dog.sleep();
        dog.speak();

        System.out.println();

        Cat cat = new Cat("Barsik", 3);
        cat.eat();
        cat.sleep();
        cat.speak();
    }


}
