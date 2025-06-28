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

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();



    }
}
