package JavaBreakthrough.AbstractExtendsInterfaceExp.InterfaceExp;

public class Animal implements Info {

    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("i'm sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is: " + id);
    }

}
