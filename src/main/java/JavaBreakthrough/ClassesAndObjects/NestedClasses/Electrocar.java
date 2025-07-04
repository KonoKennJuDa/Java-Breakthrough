package JavaBreakthrough.ClassesAndObjects.NestedClasses;

public class Electrocar {

    private int id;

    // Вложенный нестатический класс - относится к объекту, имеет доступ к его полям
    // Они нужны, чтобы разграничить логику класса на отдельные части. Как тут электрокар и у него есть мотор, коробка и так далее
    // Обычно используются с модификатором private, доступ извне не нужен. Он используется внутри самого класса
    private class Motor {
        public void startMotor() {
            System.out.println("Motor " + id + " is starting"); // имеет доступ к id
        }
    }

    // Статический вложенный класс
    // Не имеет доступа к переменным объекта класса
    // Имеет мало общего с Electrocar
    // Но имеет доступ к статическим переменным класса
    // Нужен для использования извне
    // Довольно распространенный тип вложенных классов
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    // Т.е. создавая метод класса Electrocar, мы внутри создаем еще и объект вложенного нестатического класса Motor и вызываем его метод
    public void start() {
        Motor motor = new Motor(); // как раз используем класс мотор, создаем объект и через него запускам метод
        motor.startMotor();

        final int x = 1;

        // Вложенный класс внутри метода. Схож с анонимный классом
        // Имеет
        class SomeClass {
            public void someMetod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someClass = new SomeClass();

        System.out.println("Electrocar " + id + " is starting");
    }


    // В java мы можем создавать классы внутри других классов или рядом с ними
    // Также есть три разных типа вложенных классов

}
