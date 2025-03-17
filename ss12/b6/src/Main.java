import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tiền thưởng: ");
        double bonus = Double.parseDouble(input.nextLine());
        System.out.print("Số giờ: ");
        int hour = Integer.parseInt(input.nextLine());

        Employee[] employees = new Employee[]{
                new Employee("John Doe", 30, 5000),
                new PartTimeEmployee("Jane Doe", 22, 200, hour),
                new FullTimeEmployee("Alice", 28, 7000, bonus),
                new Intern("Bob", 20, 1500)
        };

        for (Employee e : employees) {
            e.showInfo();
            System.out.println("Lương thực nhận: " + e.calculateSalary());
            System.out.println("------------------------");
        }

        input.close();
    }
}