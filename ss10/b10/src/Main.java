public class Main{
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5);
        Shape rectangle = new Rectangle("Rectangle", 4, 6);
        Shape triangle = new Triangle("Triangle", 3, 4, 5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}