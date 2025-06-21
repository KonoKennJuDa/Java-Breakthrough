package JavaBreakthrough.AbstractExtendsInterfaceExp.ExtendsExp;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.speak();
        System.out.println(animal); // Тут я не переопределил ToString, из-за этого выводится каша + нет назначенного имени и возраста
        // Вернулись бы нулевые значения или NullPointException
        // Проверил, да, нулевые значения

        System.out.println();

        Dog dog = new Dog("Max", 4);
        dog.eat();
        dog.sleep();
        dog.speak();
        System.out.println("Имя и возраст: " + dog);

        System.out.println();

        Cat cat = new Cat("Barsik", 3);
        cat.eat();
        cat.sleep();
        cat.speak();
        System.out.println("Имя и возраст: " + cat);
    }

}
