package JavaBreakthrough.ClassesAndObjects.NestedClasses;

public class ElectrocarApp {
    public static void main(String[] args) {

        Electrocar electrocar = new Electrocar(10);
        electrocar.start();


        Electrocar.Battery battery = new Electrocar.Battery(); // Создали объект класса Battery
        battery.charge(); // и вызвали его метод 

    }
}
