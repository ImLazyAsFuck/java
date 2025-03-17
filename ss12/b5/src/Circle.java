public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.pow(radius, 2) *  Math.PI;
    }

    @Override
    public String toString(){
        return "hình tròn";
    }
}
