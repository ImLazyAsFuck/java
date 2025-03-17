public class Circle implements IColorable{
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String getColor(){
        return color;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }
}
