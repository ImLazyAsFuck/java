import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(n + " x " + i + " = " +  (n * i));
        }
    }
}
