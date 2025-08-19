package Practice.Day5;

public class Task1 {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("black");
        car.setYear(2000);
        car.setModel("AUDI");

        System.out.println("Our car: " + car.getYear() + " year " + car.getModel() + " model " + car.getColor() + " color");
    }

}

class Car {

    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}