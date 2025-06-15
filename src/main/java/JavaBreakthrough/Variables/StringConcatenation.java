package JavaBreakthrough.Variables;

import java.util.Arrays;
import java.util.List;

public class StringConcatenation {

    public static void main(String[] args) {

        // В Java конкатенация (объединение) строк может быть выполнена несколькими способами:

        /**
         * Оператор.
         * Самый простой и часто используемый способ:
         */

        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;  // "Hello World"

        /**
         * Метод concat()
         * Метод concat() объединяет указанную строку с другой строкой:
         */

        String str3 = "Hello";
        String str4 = "World";
        String resultConcat = str3.concat(" ").concat(str4);  // "Hello World"

        /**
         * StringBuilder (для множественных конкатенаций)
         * Эффективен при многократном изменении строк (например, в циклах):
         */

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String resultSB = sb.toString();  // "Hello World"

        /**
         * String.join() (начиная с Java 8)
         * Удобен для объединения коллекций строк с разделителем (delimiter):
         */

        String resultJ = String.join(" ", "Hello", "World");  // "Hello World"

        List<String> words = Arrays.asList("Hello", "World");
        String resultAJ = String.join(" ", words);  // "Hello World"

        /**
         * String.format()
         * Позволяет форматировать строку с подстановкой значений:
         */

        String resultF = String.format("%s %s", "Hello", "World");  // "Hello World"

        // Иммутабельность строк: В Java строки неизменяемы, поэтому каждый раз при конкатенации создается новый объект String.
        // Производительность: Для множественных конкатенаций в циклах всегда используйте StringBuilder вместо +,
        // чтобы избежать создания множества временных объектов.

        // Пример:

        // Плохо (медленно):
        String r1 = "";
        for (int i = 0; i < 100; i++) {
            r1 += i;  // Создается новый объект на каждой итерации
        }

        // Хорошо (эффективно):
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i);
        }
        String r2 = stringBuilder.toString();

        // Выбор способа зависит от контекста: для простых случаев подойдет +, для сложных — StringBuilder или String.join().

    }
}
