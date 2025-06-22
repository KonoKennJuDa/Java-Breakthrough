package JavaBreakthrough.PolymorphismExp;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        // Позднее связывание
        dog.eat(); // Вывод будет именно того метода, который пределен в классе собаки, метод потомка. Если реализации нет, то метод родителя

        System.out.println();

        // Один из функционалов полиморфизма
        // Но есть ограничения, мы не имеем доступа к методам класса собаки
        // Тут мы рассматриваем собаку как животное
        Animal dogAnimal = new Dog();
        dogAnimal.eat();
        // dogAnimal.bark; Доступа нет

        // Тут рассматриваем собаку как собаку
        // Из-за этого имеем доступ к методам класса собаки
        Dog dog2 = new Dog();
        dog2.eat(); // Можем обратиться к методу родителя
        dog2.bark(); // И к своим методам тоже

        System.out.println();

        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        test(animal1);
        test(dog1);
        test(cat1);

    }

    // С помощью полиморфизма мы делаем код меньше и многоразовым. Этот метод вызван на трех разных типах
    // Если бы не полиморфизм, мы бы писали метод для каждого класса родителя
    // Грамотно выстроенная сеть наследований и интерфейсов позволяет пользоваться полиморфизмом
    public static void test(Animal animal) {
        animal.eat();
    }
}
