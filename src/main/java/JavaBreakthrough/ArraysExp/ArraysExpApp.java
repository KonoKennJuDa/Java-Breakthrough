package JavaBreakthrough.ArraysExp;

public class ArraysExpApp {

    public static void main(String[] args) {

        int number = 10; // Примитивный тип данных
        char character = 'A'; // Примитивный тип данных
        String string = "Hello"; // Ссылочный тип данных. Уже писал, что String это класс. Из класса создается объект

        int[] numbers = new int[5]; // numbers ==> Массив int. Ссылочный тип данных. Пока что массив заполнен по умолчанию
        for (int i = 0; i < numbers.length; i++) { // Инициализация массива через цикл for, но можно и вручную присваивать значения
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) { // Перебор всех элементов массива
            System.out.println(numbers[i]); // Вывод инициализированных данных на консоль
        }

        System.out.println(); // Пустая строка, чтобы разделить вывод. Часто буду так делать, чтобы не путаться в выводе

        int[] numbers1 = {1, 2, 3}; // Создание и инициализация массива уже с готовыми данными
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }

    }
}
