import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        String tenHocSinh = scanner.nextLine();

        System.out.print("Nhập điểm môn 1: ");
        double diem1 = scanner.nextDouble();
        System.out.print("Nhập điểm môn 2: ");
        double diem2 = scanner.nextDouble();
        System.out.print("Nhập điểm môn 3: ");
        double diem3 = scanner.nextDouble();

        double diemTrungBinh = (diem1 + diem2 + diem3) / 3;

        String xepLoai = diemTrungBinh >= 5 ? "Lên lớp" : "Học lại";

        System.out.println("\n--- Kết quả ---");
        System.out.println("Tên học sinh: " + tenHocSinh);
        System.out.println("Điểm môn 1: " + diem1);
        System.out.println("Điểm môn 2: " + diem2);
        System.out.println("Điểm môn 3: " + diem3);
        System.out.println("Điểm trung bình: " + String.format("%.2f", diemTrungBinh));
        System.out.println("Kết quả: " + xepLoai);

        scanner.close();
    }
}
