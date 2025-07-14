package JavaBreakthrough.EnumExp;

public class EnumExpTest {

    public static void main(String[] args) {

        Season season = Season.AUTUMN;
        System.out.println(season.name()); // полезный метод name, который возвращает имя константы

        System.out.println();

        Animal animal = Animal.CAT;
        System.out.println(animal.name()); // не смотря на то, что toString переопределен, мы все равно получим имя константы

        System.out.println();

        Animal frog = Animal.valueOf("FROG"); // статический метод, который вернет в строку enum и присвоим его к переменной
        System.out.println(frog.getTranslation()); // в этой же переменной вызываем метод, чтобы узнать перевод

        System.out.println();

        Season season1 = Season.WINTER;
        System.out.println(season1.ordinal()); // метод показывающий индекс enum

    }
}
