package Practice.Day11;

public class Task1 {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + " " + picker + " " + courier);

        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 1; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + " " + picker + " " + courier);

    }
}

class Warehouse {
    private int balance;
    private int countOrders;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrders) {
        this.countOrders = countOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "balance=" + balance +
                ", countOrders=" + countOrders +
                '}';
    }
}

class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountOrders(warehouse.getCountOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrders() > 1500) {
            salary *= 3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}

class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    @Override
    public void doWork() {
        salary += 80;
        warehouse.setBalance(warehouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() > 1000000) {
            salary *= 2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary + '}';
    }
}

interface Worker {
    void doWork();

    void bonus();
}