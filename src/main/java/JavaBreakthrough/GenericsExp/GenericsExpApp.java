package JavaBreakthrough.GenericsExp;

import java.util.ArrayList;
import java.util.List;

public class GenericsExpApp {

    // Generics появились в пятой Java

    public static void main(String[] args) {

        // До Java 5
        // В такую реализацию мы можем класть лютые объекты, но нужно даункастить, когда мы достаем объекты
        List animals = new ArrayList<>(); // ArrayList динамический массив
        animals.add("Cat"); // 0
        animals.add("Dog"); // 1
        animals.add("Frog"); // 2

        // String animal = animals.get(1); // Мы клали объект класса String, а возвращаются почему-то Object
        // Все потому, что объект класса List хранит в себе объекты класса Object, чтобы мы туда не положили

        String animal = (String) animals.get(1); // Мы используем downcasting, объясняем, что мы клали туда String и нам нужен String, как бы опускаемся вниз по иерархии
        System.out.println(animal);

        System.out.println();

        // Но с появлением дженериков мы делаем так
        // В эту реализацию мы можем класть только объекты типа String, как и доставать
        List<String> animals1 = new ArrayList<String>();
        animals1.add("Cat");
        animals1.add("Horse");
        animals1.add("Frog");

        String animal1 = animals1.get(1);
        System.out.println(animal1);

        System.out.println();

        // После выхода Java 7 можно не указывать второй раз дженерик
        List<String> animals2 = new ArrayList<>(); // тут не нужно указывать второй раз, что внутри лежат String

    }
}
