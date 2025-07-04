package JavaBreakthrough.ClassesAndObjects.NestedClasses;

public class Electrocar {

    private int id;

    // вложенный нестатический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Electrocar " + id + " is starting");
    }


    // В java мы можем создавать классы внутри других классов или рядом с ними
    // Также есть три разных типа вложенных классов

}
