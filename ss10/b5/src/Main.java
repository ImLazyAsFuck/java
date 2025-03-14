import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        System.out.printf("Bán kính: ");
        int radius = Integer.parseInt(input.nextLine());
        circle.setRadius(radius);
        cylinder.setRadius(radius);
        System.out.printf("Chiều cao: ");
        cylinder.setHeight(Integer.parseInt(input.nextLine()));

        System.out.printf("Diện tích hinh tròn là: %.2f\n", circle.getArea());
        System.out.printf("Thể tích hình trụ là: %.2f\n", cylinder.getVolume());
    }
}