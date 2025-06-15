package JavaBreakthrough.Cycles;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 5");
        int value = scanner.nextInt();
        while (value != 5) {
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }
        System.out.println("Вы ввели 5");

        System.out.println();

        Scanner scanner2 = new Scanner(System.in);
        int v;
        do {
            System.out.println("Введи 5");
            v = scanner2.nextInt();
        } while (v != 5);
        System.out.println("Вы ввели 5");
    }
}
