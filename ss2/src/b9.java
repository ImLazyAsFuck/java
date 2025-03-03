import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        String tenHocSinh = scanner.nextLine();

        double[] diem = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nhập điểm môn " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
        }

        double diemTrungBinh = (diem[0] + diem[1] + diem[2]) / 3;

        String xepLoai = diemTrungBinh >= 5 ? "Lên lớp" : "Học lại";

        System.out.println("\n--- Kết quả ---");
        System.out.println("Tên học sinh: " + tenHocSinh);
        for (int i = 0; i < 3; i++) {
            System.out.println("Điểm môn " + (i + 1) + ": " + diem[i]);
        }
        System.out.println("Điểm trung bình: " + String.format("%.2f", diemTrungBinh));
        System.out.println("Kết quả: " + xepLoai);

        scanner.close();
    }
}