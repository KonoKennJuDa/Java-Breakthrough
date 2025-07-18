package JavaBreakthrough.AbstractExtendsInterfaceExp.AbstractExp;

public abstract class Animal {

    // Abstract класс не является сущностью, его нельзя создавать, но от него нужно наследоваться и обязательно нужно реализовать абстрактные методы
    // Мы не можем создать объект Animal, его не существует. Это не Cat и не Dog, в реальном мире его нет, это абстракция
    // Abstract - концепция. Они используются тогда, когда мы хотим создать иерархию классов, но класс родитель не является самостоятельным классом
    // Чем-то похож на интерфейс, но интерфейс это контракт, то что класс умеет делать. А абстракция, это то, чем класс является
    // Также интерфейсов, может быть много, а абстрактный класс наследуется лишь один. Dog = Animal, просто Animal слишком абстрактно и не является сущностью
    // Абстрактный класс все же класс и у него есть какое-то поведение, какие-то методы внутри реализованны

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void makeSound(); // мы не знаем какие звуки издают животные, из-за это создаем абстрактный метод,
    // чтобы они обязательно его реализовали


}
