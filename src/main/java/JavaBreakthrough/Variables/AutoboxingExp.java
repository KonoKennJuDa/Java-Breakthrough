package JavaBreakthrough.Variables;

public class AutoboxingExp {

    public static void main(String[] args) {

        int x = 1; // Если нужно просто число, то используется просто примитив

        // Integer x1 = new Integer(123); так делается в редких случаях. Используется если нужен метод класса примитива
        Integer.parseInt("123");

        // Double, Float, Long, Integer, Short, Byte, Character и Boolean - обертки
        // Обертки нужны для большего функционала, если мы хотим что-то сделать с переменной и использовать методы внутри классов каждой обертки

        // Autoboxing
        Integer x3 = 123; // Java самостоятельно упаковывает примитив в соответсвующую обертку
        // Integer x4 = new Integer(123); - Это тоже самое, что и сверху. Java сама упаковывает
        int y = x3; // Мы можем также присвоить его к примитиву
        System.out.println(y);

        System.out.println();

    }
}
