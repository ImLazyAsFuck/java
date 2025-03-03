import java.math.BigInteger;
import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên lớn thứ nhất: ");
        BigInteger num1 = new BigInteger(scanner.nextLine());

        System.out.print("Nhập số nguyên lớn thứ hai: ");
        BigInteger num2 = new BigInteger(scanner.nextLine());

        System.out.println("Tổng: " + num1.add(num2));
        System.out.println("Hiệu: " + num1.subtract(num2));
        System.out.println("Tích: " + num1.multiply(num2));
        System.out.println("Thương: " + num1.divide(num2));
        System.out.println("Phần dư: " + num1.remainder(num2));
        System.out.println("Lũy thừa bậc 10 của số thứ nhất: " + num1.pow(10));
        System.out.println("Lũy thừa bậc 10 của số thứ hai: " + num2.pow(10));

        scanner.close();
    }
}
