package Practice.Day11;

public class Task1 {

    public static void main(String[] args) {


    }
}

class Warehouse {
    private int balance;
    private int countOrders;

    @Override
    public String toString() {
        return "Warehouse{" +
                "balance=" + balance +
                ", countOrders=" + countOrders +
                '}';
    }
}

class Picker {
    private int salary;

}

class Courier {
    private int salary;

}