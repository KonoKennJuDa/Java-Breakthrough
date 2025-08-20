package Practice.Day8;

public class Task2 {

    public static void main(String[] args) {
        Airplane airplane = new Airplane(30, 40000, 2010, "Boeing");
        System.out.println(airplane);

    }

}

class Airplane {

    private int length;
    private int weight;
    private int fuel;
    private int year;
    private String producer;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Airplane(int length, int weight, int year, String producer) {
        this.length = length;
        this.weight = weight;
        this.year = year;
        this.producer = producer;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес " + weight + ", объем бака: " + fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public static void compareAirplane(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }

    }

    @Override
    public String toString() {
        return "Самолет: " +
                " длина: " + length +
                ", вес: " + weight +
                ", топливо: " + fuel +
                ", год: " + year +
                ", изготовитель: " + producer;
    }

}