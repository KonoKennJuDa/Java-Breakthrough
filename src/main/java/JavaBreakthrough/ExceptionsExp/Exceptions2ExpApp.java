package JavaBreakthrough.ExceptionsExp;

import java.util.Scanner;

public class Exceptions2ExpApp {
    public static void main(String[] args) throws ScannerException {

        // Сканер считывает введенные в консоль данные
        Scanner scanner = new Scanner(System.in);
        // Цикл выполняется, пока int x = 0
        while (true) {
            int x = Integer.parseInt((scanner.nextLine()));

            // Как только x не равен нулю, выбрасывается исключение, которые мы создали
            if (x != 0) {
                throw new ScannerException("Пользователь ввел что-то кроме нуля"); // Наше исключение с параметром String
            }
        }
    }
}
