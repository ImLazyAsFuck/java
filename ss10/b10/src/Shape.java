public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter();
    }
}