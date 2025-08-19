package Practice.Day5;

public class Task2 {

    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(2000, "kawasaki", "red");
        System.out.println(motorbike.getModel() + "\n" +
                motorbike.getYear() + "\n" +
                motorbike.getColor());
    }
}

class Motorbike {

    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

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