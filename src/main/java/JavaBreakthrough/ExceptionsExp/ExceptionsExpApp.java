package JavaBreakthrough.ExceptionsExp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExpApp {

    public static void main(String[] args) { //throws FileNotFoundException

        File file = new File("asdf");

        // Как раз вариант с try.catch. Попробуй try, если нет, то catch ловит exception
        try {
            Scanner scanner = new Scanner(file); // Тут Exception. Мы можем кинуть exception на метод или кинуть catch/exception
            // Т.е. естественно, если файла нет, то будет ошибка и мы должны ее как-то обработать
        } catch (FileNotFoundException exception) { // Это удобно, потому что мы можем сами прописать блок с исключением, exception
            //exception.printStackTrace(); этим методом, мы выводим ошибку на экран
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");


    }
}
