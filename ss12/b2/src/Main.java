import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.printf("a = ");
        a = Integer.parseInt(input.nextLine());
        System.out.printf("b = ");
        b = Integer.parseInt(input.nextLine());
        System.out.printf("c = ");
        c = Integer.parseInt(input.nextLine());
        Caculator caculator = new Caculator(a, b, c);

        System.out.println("Tổng a + b = " + caculator.add(a, b));
        System.out.println("Tổng a + b + c = " + caculator.add(a, b, c));
    }
}