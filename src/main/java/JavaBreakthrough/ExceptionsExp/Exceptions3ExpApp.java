package JavaBreakthrough.ExceptionsExp;

import java.io.File;
import java.util.Scanner;

public class Exceptions3ExpApp {

    public static void main(String[] args) {
        // Checked Exception - исключения во время компиляции, исключения проверяемые, чекаемые. Compile time exception = Исключительный случай
        // Unchecked Exception - исключение, которые идут в реальном времени. Runtime Exception = ошибка в работе программы

        ///////////////////// Checked Exception

        // File file = new File("test");
        // Scanner scanner = new Scanner(file); // тут как раз checked exception, его нужно обязательно обработать, код не скомпелируется без этого
        // есть вероятность исключение из-за этого обязали их обрабатывать. Это исключительный случай = нужно исключение

        ///////////////////// Unchecked Exception

        // int a = 1 / 0; // тут уже unchecked exception, runtime exception
        // его не обязывают обрабатывать, его нужно просто убрать

        // String name = null; // опять же unchecked exception, ведь внутри лежит null, т.е. ничего не лежит
        // name.length(); // а тут мы пытаемся еще и что-то сделать с null(ем)

        // int[] arr = new int[2];
        // System.out.println(arr[2]); // опять же unchecked exception, массив идет с 0 и до 1, ведь там два элемента

    }
}
