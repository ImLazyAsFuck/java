import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder trimedSb = new StringBuilder(sb.toString().trim());
        String[] words = trimedSb.toString().split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            System.out.printf("%s", words[i]);
            if(i > 0){
                System.out.printf(" ");
            }
        }
    }
}
