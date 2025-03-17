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
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString(){
        return "hình tròn";
    }
}

