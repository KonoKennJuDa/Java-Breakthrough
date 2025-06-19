package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class Dog extends Animal {

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Мы переопределили метод родительского/наследуемого класса под свой
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}
