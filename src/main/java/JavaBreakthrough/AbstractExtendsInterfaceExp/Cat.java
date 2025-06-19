package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class Cat extends Animal{

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Мы переопределили метод родительского/наследуемого класса под свой
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
