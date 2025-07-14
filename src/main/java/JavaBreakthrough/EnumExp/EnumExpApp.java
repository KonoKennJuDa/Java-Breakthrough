package JavaBreakthrough.EnumExp;

public class EnumExpApp {

    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT:
                System.out.println("Это кот");
                break;
            case DOG:
                System.out.println("Это собака");
                break;
            case FROG:
                System.out.println("Это лягушка");
                break;
            default:
                System.out.println("Это не животное");
        }

    }
}
