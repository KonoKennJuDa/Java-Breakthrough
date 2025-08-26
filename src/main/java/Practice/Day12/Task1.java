package Practice.Day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMW");
        list.add("Lada");
        list.add("UAZ");
        list.add("Toyota");

        System.out.println(list);

        list.add(2, "Mercedes");

        System.out.println(list);

        list.removeFirst(); // Удаляет первый элемент из списка, но можно также написать list.remove(0); указать индекс элемента самому в общем

    }
}
