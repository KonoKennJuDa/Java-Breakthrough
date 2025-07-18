package JavaBreakthrough.RecursionExp;

public class RecursionExpTest {

    public static void main(String[] args) {

        counter(5); // условие, переменная, откуда мы начнем отсчет

        System.out.println();

        System.out.println(facto(15)); // рекурсия через факториал, чтобы понять было легче
        // Представь, что ты стримишь себе стрими, в котором стримишь стрим и так далее, получается рекурсия, а в программировании
        // Открывается метод в методе и в методе и в методе, а после данные идут с самого конца вверх.
        // Т.е. сначала вызвалось 15, потом 14, потом 13 и все это лежит в стеке и ждет, пока все методы не дойдут до 1,
        // а после поднимались вверх и перемножали все значения

    }

    // Рекурсия, обращение метода к самому себе же, но, чтобы не было ошибки, нужно условие
    private static void counter(int n) {
        if (n == 0) // это условие выхода
            return; // когда будет 0 метод закроется и ниже не пойдет.

        System.out.println(n);

        counter(n - 1);
    }

    private static int facto(int n) {
        if (n == 1)
            return 1;

        return n * facto(n - 1);
    }

}
