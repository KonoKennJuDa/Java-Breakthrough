package JavaBreakthrough.ExceptionsExp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExpApp {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("asdf");
        Scanner scanner = new Scanner(file); // Тут Exception. Мы можем кинуть exception на метод или кинуть catch/exception
        // Т.е. естественно, если файла нет, то будет ошибка и мы должны ее как-то обработать



    }
}
