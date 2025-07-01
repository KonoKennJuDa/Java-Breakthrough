package JavaBreakthrough.ExceptionsExp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4ExpApp {

    public static void main(String[] args) {

        try {
            run();
        } catch (IOException | IllegalAccessException |
                 ParseException e) { // реализация для всех исключений в одном catch
            e.printStackTrace();
        }

        try {
            run();
        } catch (
                Exception e) { // можно проверять исключение от родителя всех исключений, но тогда следующие блоки не будут смысла
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalAccessException { // можно пробрасывать не одно исключение

    }
}
