package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class Dog extends Animal {

    // Это уже я балуюсь и решил создать конструктор, чтобы можно было назначить имя и возраст
    // Переменные наследуются от родительского класса
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Мы переопределили метод родительского/наследуемого класса под свой
    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
