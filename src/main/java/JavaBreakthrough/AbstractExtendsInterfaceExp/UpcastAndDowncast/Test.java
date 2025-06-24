package JavaBreakthrough.AbstractExtendsInterfaceExp.UpcastAndDowncast;

public class Test {

    public static void main(String[] args) {

        // Upcasting - восходящее преобразование. Безопасное и логично. Мы всегда можем наследника представить как родителя
        Animal animal = new Dog(); // Объект рассматриваем как его родителя. Идем от наследника к родителю
        animal.eat();
        //animal.speak(); это метод Dog, его нельзя получить через родителя

        System.out.println();

        Dog dog = new Dog();
        Animal animal1 = dog; // Тут тоже восходящее преобразование. Dog стал Animal
        animal1.eat();
        //animal1.speak(); опять же нет доступа к этому методу

        System.out.println();

        // Downcasting - нисходящее преобразование. Не всегда безопасно. У нас в переменной Animal не всегда может лежать наследник, и даже если лежит наследник, у него может не быть этого метода
        //Dog dog1 = animal3; так нельзя. Там нужно явно обозначить какое животное будет
        Dog dog1 = (Dog) animal;
        dog1.eat();
        dog1.speak(); // Тут метод доступен

        System.out.println();

        // Нисходящее преобразование бывает опасным
        Animal a = new Animal(); // Мы создали объект Animal
        Dog d = (Dog) a; // Но говорим, что это Dog
        d.speak(); // Будет ошибка ClassCastException

    }
}
