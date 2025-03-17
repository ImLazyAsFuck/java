import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ô tô");
        System.out.print("Tên: ");
        String name = input.nextLine();
        System.out.print("Tốc độ: ");
        int speed = Integer.parseInt(input.nextLine());

        Car car = new Car(name, speed);
        System.out.println();

        System.out.println("Xe đạp");
        System.out.print("Tên: ");
        name = input.nextLine();
        System.out.print("Tốc độ: ");
        speed = Integer.parseInt(input.nextLine());

        Bike bike = new Bike(name, speed);

        System.out.println();
        car.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}