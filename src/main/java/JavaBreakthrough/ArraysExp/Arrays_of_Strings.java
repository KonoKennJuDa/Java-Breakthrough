package JavaBreakthrough.ArraysExp;

public class Arrays_of_Strings {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        System.out.println();

        String[] strings = new String[3]; // Три объекта класса String
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Джава";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println();

        for (String string : strings) { // Сначала пишем тип данных, далее имя переменной для перебора и далее массив, который будем перебирать
            System.out.println(string); // Выводим имя переменной, логично, потому что туда помешаются перебираемые данные из массива
        }

        System.out.println();

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
        System.out.println(sum);

        System.out.println();

        int value = 0; // 32 бита памяти
        String s; // Мы не знаем, сколько бит будет занимать строка. Выделяется память только под ссылку, под s. Тут по умолчанию Null
        // Null показывает, что переменная ни на что не ссылается. Это не строка, - null
        // Суть в том, что создавая переменную ссылочку, не назначая ее, мы выделяем паять только под саму ссылку, без объекта
        String s1 = "Привет, мир"; // Тут мы знаем сколько занимает памяти, так как мы задекларировали ссылку

    }
}
