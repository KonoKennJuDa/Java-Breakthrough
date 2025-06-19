package JavaBreakthrough.StaticExp;

public class Man {

    // Переменные объекта. Существуют в объекте
    private String name;
    private int age;

    // Переменные класса. Даже если нет объекта, она все равно существует
    public static String description;
    public static int countMan;

    // Каждый раз когда создается объект, вызывается конструктор с уникальными переменными объекта и с общей переменной класса,
    // статичной переменной, которая инкрементируется
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
        countMan++; // Инкремент
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAllField() {
        System.out.println( name + ", " + age + ", " + description);
    }

    public static void printAllFields () {
        // System.out.println(name); статический метод не может работать с переменные объекта
    }

    // Метод все равно существует, даже если нет объекта
    public static void getDescription () {
        System.out.println(description);
    }

    // Вывод переменной класса с количеством созданных объектов. Переменная инициализируется в конструкторе
    public void printNumberOfMan() {
        System.out.println("Номер людей: " + countMan);
    }

}
