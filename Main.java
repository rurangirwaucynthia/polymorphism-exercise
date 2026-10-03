// Base class
class Shape {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Base implementation: a generic shape has no defined area
    public double calculateArea() {
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // π × r²
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; // length × width
    }
}

public class Main {
    public static void main(String[] args) {
        Shape genericShape = new Shape("Generic Shape", "Gray");
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);

        Shape[] shapes = { genericShape, circle, rectangle };

        for (Shape s : shapes) {
            System.out.printf("%s (%s) area = %.2f%n",
                    s.getName(), s.getColor(), s.calculateArea());
        }
    }
}
