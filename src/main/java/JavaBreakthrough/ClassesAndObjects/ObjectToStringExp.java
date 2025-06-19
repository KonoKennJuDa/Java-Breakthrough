package JavaBreakthrough.ClassesAndObjects;

public class ObjectToStringExp {

    // Все классный наследуются от класса object, т.е перенимают его поля и методы
    // Все классный которые мы декларируем, должны быть собой + обязательно объектом (object)
    public static void main(String[] args) {

        // Здесь toString работает корректно
        String s = "Hello";
        System.out.println(s);

        System.out.println();

        // Тут надо переопределить toString
        Test test = new Test("Bob", 40);
        System.out.println(test);

    }
}

class Test {

    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // мы переопределили метод, который взят/унаследован у object,
    // чтобы наш класс и объект созданный по его подобию имел этот метод + он работал как мы хотим
    @Override
    public String toString() {
        return "Test: " + "name: " + name + '\'' + "age: " + age;
    }
}