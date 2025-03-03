import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        int leapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 1 : 0;
        int daysInMonth = 28 + ((month + (month / 8)) % 2) + 2 % month + (1 / month) * (leapYear * (month / 2 + 2 % month));

        day = (day % daysInMonth) + 1;
        month = month + (day == 1 ? 1 : 0);
        year = year + (month == 13 ? 1 : 0);
        month = (month % 13) + (month / 13);

        System.out.println("Ngày tiếp theo: " + day + "/" + month + "/" + year);

        System.out.print("Nhập ngày thứ hai: ");
        int day2 = scanner.nextInt();
        System.out.print("Nhập tháng thứ hai: ");
        int month2 = scanner.nextInt();
        System.out.print("Nhập năm thứ hai: ");
        int year2 = scanner.nextInt();

        int days1 = year * 365 + day + (month * 30) + ((month / 2) * (month % 2)) + (month > 2 ? leapYear : 0);
        int days2 = year2 * 365 + day2 + (month2 * 30) + ((month2 / 2) * (month2 % 2)) + (month2 > 2 ? ((year2 % 4 == 0 && (year2 % 100 != 0 || year2 % 400 == 0)) ? 1 : 0) : 0);

        System.out.println("Số ngày giữa hai ngày: " + Math.abs(days1 - days2));

        scanner.close();
    }
}