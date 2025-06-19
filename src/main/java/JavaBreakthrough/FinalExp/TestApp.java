package JavaBreakthrough.FinalExp;

public class TestApp {

    public static void main(String[] args) {

        // Test.CONSTANT = 10; Константу нельзя менять

        // Также константами могут быть и переменные в методе
        final int X = 20;
        System.out.println(X);
        // X = 30; опять же не можем ее менять
    }
}
