package JavaBreakthrough.Input;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Из класса Scanner мы создали объект Scanner с помощью слова new и обратились к его конструктору System.in
        System.out.println("Введите слово");
        String string = s.nextLine(); // Создали переменную String и присвоили к ней данные из метода nextLine взятого у объекта s (Scanner)
        System.out.println("Вы ввели " + string);

        System.out.println();

        Scanner x = new Scanner(System.in);
        System.out.println("Введите цифру");
        int z = x.nextInt(); // Создали переменную int и присвоили ей данные из метода nextInt взятого из объекта x (Scanner)
        System.out.println("Вы ввели " + z);

        // Тут есть тонкости. В String можно вводить строку или число, но все это будет переменной String
        // В int можно вводить только число и только целое, иначе будет ошибка (Exception)

    }
}
