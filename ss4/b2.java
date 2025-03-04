import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int isNotPrime = 0;
        if(n < 2){
            System.out.println(n + " không phải số nguyên tố");
            return;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isNotPrime = i;
                break;
            }
        }
        if(isNotPrime == 0){
            System.out.println(n + " là số nguyên tô");
        }else System.out.println(n + " không phải số nguyên tố");
    }
}
