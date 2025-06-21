package JavaBreakthrough.AbstractExtendsInterfaceExp.InterfaceExp;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal(24);
        animal.sleep();
        animal.showInfo();
        Person person = new Person("Petr");
        person.sayHello();
        person.showInfo();

        System.out.println();

        // Можно реализовать и через интерфейс, так как есть связь
        // Но мы как бы смотрим через призму именно интерфейса, других методов, кроме тех, что в интерфейсе, у нас не будет
        // Это по сути полиморфизм
        Info animal1 = new Animal(30);
        animal1.showInfo();
        Info person1 = new Person("Bob");
        person1.showInfo();

    }
}
