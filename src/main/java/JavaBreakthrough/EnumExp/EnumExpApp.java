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

        System.out.println();

        //Как это работает? Object -> Enum -> Season наследование идет по такой логике
        Season season = Season.SUMMER;
        switch (season) {
            case SUMMER -> System.out.println("Это лето");
            case WINTER -> System.out.println("Это зима");
        }

        System.out.println(season.getClass());

        System.out.println();

        Animal animal1 = Animal.CAT;
        System.out.println(animal1.getTranslation());
        System.out.println(animal1);


    }
}
