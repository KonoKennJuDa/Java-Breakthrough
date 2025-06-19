package JavaBreakthrough.AbstractExtendsInterfaceExp;

public class Dog extends Animal {

    // Мы переопределили метод родительского/наследуемого класса под свой
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}
