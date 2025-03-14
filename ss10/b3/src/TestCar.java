import java.util.Scanner;

public class TestCar{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Car car = new Car();

        System.out.printf("Thương hiệu: ");
        car.setMake(input.nextLine());
        System.out.printf("Mẫu: ");
        car.setModel(input.nextLine());
        System.out.printf("Năm: ");
        car.setYear(Integer.parseInt(input.nextLine()));

        System.out.println();
        System.out.printf("Thương hiệu: %s\n", car.getMake());
        System.out.printf("Mẫu: %s.\n", car.getModel());
        System.out.printf("Năm: %d\n", car.getYear());
    }
}