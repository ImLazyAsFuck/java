import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        IColorable[] shapeColors = new IColorable[]{
                new Circle(2),
                new Rectangle(2, 3)
        };

        String color;
        for(IColorable shapeColor : shapeColors){
            System.out.print("Shape color: ");
            color = input.nextLine();
            shapeColor.setColor(color);
        }

        for(IColorable shapeColor : shapeColors){
            System.out.println("Shape color: " + shapeColor.getColor());
        }
    }
}