package Practice.Day8;

public class Task1 {

    public static void main(String[] args) {

        String numbers = "";

        long before = System.currentTimeMillis();

        //Плохой вариант конкатенации, String иммутабельная. Каждый раз будет создаваться новая строка
        for (int i = 0; i <= 20000; i++) {
            numbers += +i + " ";
        }

        long after = System.currentTimeMillis();

        System.out.println("Время выполнения цикла с классом String: " + (after - before));
        System.out.println(numbers);


        StringBuilder stringBuilder = new StringBuilder("");

        before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }

        after = System.currentTimeMillis();

        System.out.println("Время выполнения цикла с классом StringBuilder: " + (after - before));
        System.out.println(stringBuilder);

    }

}
