import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        System.out.print("Nhập hệ số d: ");
        double d = scanner.nextDouble();

        double delta = b * b - 4 * c * d;
        double x1 = (-b + Math.sqrt(delta)) / (2 * c);
        double x2 = (-b - Math.sqrt(delta)) / (2 * c);
        double x = -b / (2 * c);

        String result = (a == 0)
                ? ((delta > 0)
                ? "Phương trình có hai nghiệm: " + x1 + " và " + x2
                : (delta == 0)
                ? "Phương trình có nghiệm kép: " + x
                : "Phương trình vô nghiệm.")
                : "Giải phương trình bậc ba bằng phương pháp Cardano hoặc Newton-Raphson không được triển khai trong chương trình này.";

        System.out.println(result);

        scanner.close();
    }
}