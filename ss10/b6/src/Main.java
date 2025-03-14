import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Point p = new Point();
        MoveablePoint m = new MoveablePoint();

        System.out.printf("x = ");
        double x = Double.parseDouble(input.nextLine());
        System.out.printf("y = ");
        double y = Double.parseDouble(input.nextLine());

        System.out.printf("xSpeed = ");
        double xSpeed = Double.parseDouble(input.nextLine());
        System.out.printf("ySpeed = ");
        double ySpeed = Double.parseDouble(input.nextLine());

        p.setX(x);
        p.setY(y);
        m.setX(x);
        m.setY(y);
        m.setxSpeed(xSpeed);
        m.setySpeed(ySpeed);

        System.out.println(p);
        System.out.println(m);
    }
}