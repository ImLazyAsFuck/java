import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) {
                if(i != 0){
                    sb.append("_");
                }
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
