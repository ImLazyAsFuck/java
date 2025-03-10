import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        sb.append(sc.nextLine());
        StringBuilder lowerSb = new StringBuilder(sb.toString().toLowerCase());
        if(lowerSb.toString().equals(sb.reverse().toString())){
            System.out.println("Chuỗi đối xứng");
        }else{
            System.out.println("Chuôi không đối xứng");
        }
    }
}
