import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Giá trị không hợp lệ");
            return;
        }
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        System.out.println(sb.toString());
    }
}
