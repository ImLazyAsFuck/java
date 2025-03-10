import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println(sb);
        System.out.println(sb.delete(5,9));
        System.out.println(sb.delete(5,9).replace(5, 14," Universe"));
    }
}
