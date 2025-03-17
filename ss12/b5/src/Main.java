import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Chiều rộng: ");
        int w = Integer.parseInt(input.nextLine());
        System.out.printf("Chiều dài: ");
        int h = Integer.parseInt(input.nextLine());
        System.out.printf("Cạnh: ");
        int e = Integer.parseInt(input.nextLine());
        System.out.printf("Bán kính: ");
        double r = Double.parseDouble(input.nextLine());

        Shape[] shapes = new Shape[]{new Shape(), new Circle(r), new Rectangle(w, h), new Square(e)};
        for(Shape s : shapes){
            System.out.println("Diện tích " + s.toString() + " là: " + s.area());
        }
    }
}