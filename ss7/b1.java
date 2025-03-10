import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder strBuilder = new StringBuilder();
        int strSize = 3;
        for(int i = 0; i < strSize; i++){
            strBuilder.append(sc.nextLine());
        }
        System.out.println(strBuilder.toString().toUpperCase());
    }
}
