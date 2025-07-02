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
