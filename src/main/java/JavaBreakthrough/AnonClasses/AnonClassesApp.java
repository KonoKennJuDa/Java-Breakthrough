package JavaBreakthrough.AnonClasses;

public class AnonClassesApp {

    public static void main(String[] args) {

        // Обычное создание объекта с методами
        AnimalTest animalTest = new AnimalTest();
        animalTest.eatTest();

        System.out.println();

        // Мы внутри класса создали другой, вложенный класс и там переопределили метод, но это странно, долго и не гибко
        OtherAnimalTest otherAnimalTest = new OtherAnimalTest();
        otherAnimalTest.eatTest();

        System.out.println();

        // Мы создаем анонимный класс, который наследуется от родителя и переопределяет метод,
        // По сути тоже самое, что мы создавали выше, только можно использовать всего раз
        // Т.е. создается не AnimalTest объект, а анонимный объект, который наследник класса AnimalTest
        AnimalTest animalTest1 = new AnimalTest() {
            public void eatTest() {
                System.out.println("Other Animal is eating x2"); // Переопределяем метод родителя
            }
        };
        animalTest1.eatTest();

        System.out.println();

        // Мы создаем объект интерфейса, точнее анонимный класс, который наследуется и реализирует методы интерфейса AbleToEat
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating"); // Пишем реализацию
            }
        };
        ableToEat.eat();

    }

}
