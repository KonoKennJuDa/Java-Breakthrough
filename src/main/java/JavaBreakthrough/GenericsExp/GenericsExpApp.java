package JavaBreakthrough.GenericsExp;

import java.util.ArrayList;
import java.util.List;

public class GenericsExpApp {

    // Generics появились в пятой Java

    public static void main(String[] args) {

        // Параметризация в Java
        List animals = new ArrayList<>(); // ArrayList динамический массив
        animals.add("Cat"); // 0
        animals.add("Dog"); // 1
        animals.add("Frog"); // 2

        String animal = animals.get(1); // Мы клали объект класса String, а возвращаются почему-то Object
        // Все потому, что объект класса List хранит в себе объекты класса Object, чтобы мы туда не положили

    }
}
