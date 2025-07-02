package JavaBreakthrough.EqualsExp;

public class EqualsExpApp {

    public static void main(String[] args) {

        int x = 1;
        int y = 1;
        System.out.println(x == y); // работает с примитивными типами данных

        System.out.println();

        Animal animal = new Animal(10);
        Animal animal1 = new Animal(10);

        System.out.println(animal == animal1); // false // такое сравнение для ссылочных типов данных не работает, их надо сравнивать по equals
        // animal    ->  {1} в одном участке памяти
        // animal2   ->  {1} в другом участке памяти
        // Мы сравниваем указатели в примере выше, а надо сравнивать структурно через equals, это метод из класса Object
        System.out.println(animal.equals(animal1)); // false пока не переопределили и true, когда переопределили // опять же будем сранивать ссылки, пока не переопределим метод в классе Animal

        // equals нужен для сравнения объектов по структуре, как сущности
        // Если нужно сравнить объекты как ссылки, т.е. ссылаются ли они на один и тот же объект то мы используем ==

        System.out.println();

        // Сравнение строк
        String string = "Hello";
        String string1 = "Hello";

        System.out.println(string.equals(string1));
        System.out.println(string == string1); // так тоже работает, хоть IDE и ругается. Это работает, потому что есть String pool.
        // Создается строка "Hello" и на нее ссылается переменная string
        // Также когда создается переменная string1, то java видит, что она хочет присвоить объект такой же, и просто ссылает его на уже созданный такой же объект

        System.out.println();

        // Но можно создавать уникальные объекты для строк, даже если они одинаковые
        String s = new String("Bye");
        String s1 = new String("Bye");
        // Эти два объекта одинаковые, но создаются отдельно. Каждая переменная ссылается на свой объект
        System.out.println(s == s1); // такая запись уже не сработает в данном случае

        String a = "Hi";
        String b = "Hi123".substring(0,5);


    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }

}
