package JavaBreakthrough.Variables;

public class PTypeExp {

    public static void main(String[] args) {

        int age = 28;
        short year = 2025;
        long bigNum = 1000000000L; // long l = 1231231231231231231; без L в конце java не поймет это int или long
        byte smallNum = 100;
        double price = 99.99;
        float pi = 3.14F; // float f = 123.2; без F в конце java не поймет это double или float

        System.out.println();

        // Приведение типов, но неправильное
        long y = 100000000000L;
        int x = y;

        // Приведение типов явное, правильное
        int x1 = 140;
        long y1 = x1;


    }
}
