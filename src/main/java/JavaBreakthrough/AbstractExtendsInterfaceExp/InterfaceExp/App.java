package JavaBreakthrough.AbstractExtendsInterfaceExp.InterfaceExp;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal(24);
        animal.sleep();
        animal.showInfo();
        outputInfo(animal); // Можем вызвать метод тут
        Person person = new Person("Petr");
        person.sayHello();
        person.showInfo();
        outputInfo(person); // Можем вызвать метод тут

        System.out.println();

        // Можно реализовать и через интерфейс, так как есть связь
        // Но мы как бы смотрим через призму именно интерфейса, других методов, кроме тех, что в интерфейсе, у нас не будет
        // Это по сути полиморфизм
        Info animal1 = new Animal(30);
        animal1.showInfo();
        outputInfo(animal1); // Можем вызвать метод тут. Вызывается реализация описанная у данного объекта (showInfo())
        Info person1 = new Person("Bob");
        person1.showInfo();
        outputInfo(person1); // Можем вызвать метод тут. Вызывается реализация описанная у данного объекта (showInfo())

    }

    // Метод, который работает с объектами с интерфейсом инфо
    public static void outputInfo(Info info) {
        info.showInfo();
    }

}
