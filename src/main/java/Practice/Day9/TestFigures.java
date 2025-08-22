package Practice.Day9;

public class TestFigures {

    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Blue", 10, 30, 10),
                new Triangle("Red", 10, 15, 20),
                new Rectangle("Red", 5, 10),
                new Rectangle("Blue", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5),
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;

        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                sum += figure.area();
            }
        }
        return sum;
    }

}

abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

}

class Circle extends Figure {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rectangle extends Figure {
    private double wight, height;

    public Rectangle(String color, double wight, double height) {
        super(color);
        this.height = height;
        this.wight = wight;
    }

    @Override
    public double area() {
        return wight * height;
    }

    @Override
    public double perimeter() {
        return 2 * (wight + height);
    }
}

class Triangle extends Figure {
    private double c, a, b;


    public Triangle(String color, double a, double c, double b) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}