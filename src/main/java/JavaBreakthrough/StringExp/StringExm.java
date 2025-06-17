package JavaBreakthrough.StringExp;

public class StringExm {

    public static void main(java.lang.String[] args) {

        // Объекты класса String иммутабельные, они неизменяемые
        java.lang.String x = "Hello"; // Так как этого значения на переменной больше нет, она удалится, со временем, JGC. На нее никто не ссылается
        x.toUpperCase(); // Ничего не произойдет. Все методы класса String возвращают новую строку, они не работают с уже имеющейся строкой
        x = x.toUpperCase(); // Вот тут сработает, потому что мы создаем новый объект и туда кладем измененную переменную. Т.е. ту x мы поменяли на новую x
        System.out.println(x);

        System.out.println();

        java.lang.String string = "Hello";
        java.lang.String string1 = " my";
        java.lang.String string2 = " friend";
        java.lang.String stringAll = string + string1 + string2; // такой метод возможен, но на малом количестве строк. Каждое складывание создает новую строку и компилятор выделяет память
        System.out.println(stringAll);

    }
}
