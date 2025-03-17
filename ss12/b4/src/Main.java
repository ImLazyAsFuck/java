import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập bán kính: ");
        double radius = Double.parseDouble(input.nextLine());

        System.out.printf("Nhập chiều dài: ");
        int height = Integer.parseInt(input.nextLine());
        System.out.printf("Nhập chiều rộng: ");
        int width = Integer.parseInt(input.nextLine());

        Shape[] shapes = new Shape[]{new Shape() ,new Circle(radius), new Rectangle(width, height)};
        for(Shape s: shapes){
            System.out.println("Diện tích của " + s.toString() + " là: " + s.area() );;
        }
    }
}