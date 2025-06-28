package JavaBreakthrough.OutputExp;

import java.io.File;
import java.io.FileNotFoundException;
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
        scanner.close(); // Scanner в конце работы надо закрывать

        System.out.println();

        // Другой способ чтения



    }
}
