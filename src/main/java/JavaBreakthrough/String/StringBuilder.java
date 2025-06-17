package JavaBreakthrough.String;

public class StringBuilder {

    public static void main(String[] args) {

        // Объекты класса String иммутабельные, они неизменяемые
        String x = "Hello"; // Так как этого значения на переменной больше нет, она удалится, со временем, JGC. На нее никто не ссылается
        x.toUpperCase(); // Ничего не произойдет. Все методы класса String возвращают новую строку, они не работают с уже имеющейся строкой
        x = x.toUpperCase(); // Вот тут сработает, потому что мы создаем новый объект и туда кладем измененную переменную. Т.е. ту x мы поменяли на новую x
        System.out.println(x);
    }
}
