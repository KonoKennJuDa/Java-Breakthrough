package JavaBreakthrough.Constructor;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee1 = new Employee("Олег");
        Employee employee2 = new Employee("Игорь", 42);

        System.out.println();

        // Это вне урока, просто решил побаловаться и посмотреть как меняется переменна после конструктора
        employee1.getInfo();
        employee1.setAge(30);
        employee1.setName("Больше не Олег");
        employee1.getInfo();

        System.out.println();

        employee2.getInfo();
        employee2.setAge(52);
        employee2.setName("Постаревший Игорь");
        employee2.getInfo();

    }
}
