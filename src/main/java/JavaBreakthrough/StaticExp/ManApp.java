package JavaBreakthrough.StaticExp;

public class ManApp {

    public static void main(String[] args) {

        // Создание объекта с переменные объекта, но у них также есть переменные класса
        Man man = new Man("Bob", 32);
        man.setName("Tom");
        man.printNumberOfMan();

        // Обращение к статической переменной класса, она будет общей для всех объектов
        Man.description = "Nice";
        Man.getDescription();

        // При создании объектов, переменные объектов создаются заново, даже если они такие же, но static переменная создается один раз для всех

        Man man1 = new Man("Tim", 40);
        man1.printNumberOfMan();
        Man man2 = new Man("Dima", 30);
        man2.printNumberOfMan();
        Man.description = "Good";
        man1.getAllField();
        man2.getAllField();
        Man.description = "Bad";
        man1.getAllField();
        man2.getAllField();

        System.out.println();

        //Пример использования статического метода из класса Math. Math - класс коллекция со статическими методами
        System.out.println(Math.pow(2,4));
        System.out.println(Math.PI);

    }
}
