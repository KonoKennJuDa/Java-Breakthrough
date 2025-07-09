package JavaBreakthrough.OutputExp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {

    public static void main(String[] args) throws FileNotFoundException {

        // Мы у класса File вызываем константу separator
        String separator = File.separator;
        // Путь к файлу присваиваем к переменной
        String path = separator + "C:" + separator + "Users" + separator + "Saccaggi" + separator + "Desktop" + separator + "Text.txt";

        // Класс File и создание объекта с нашим путем/файлом. Некая абстракция для работы далее
        File file = new File(path);

        // Scanner с созданием объекта Scanner со считыванием нашего файла и цикл для вывода строчек из файла
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close(); // Scanner в конце работы надо закрывать, чтобы поток не оставался открытым

        System.out.println();

        // Другой способ чтения

        String path2 = separator + "C:" + separator + "Users" + separator + "Saccaggi" + separator + "Desktop" + separator + "Text2.txt";

        File file2 = new File(path2);

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] numbersString = line.split(" "); // Метод split разделяет строку по пробелам. Это регулярные выражения
        int[] numbers = new int[5];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));

        scanner2.close();

        // Еще вариант

        File file3 = new File("Test3"); // Файл лежит в корне проекта, более того, в этом же пакете

        // Все это я бы еще пересмотрел и прочитал бы в нейронке задавая вопросы

    }
}
