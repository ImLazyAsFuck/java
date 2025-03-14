public class Circle{
    private int radius;

    public Circle(){}

    public Circle(int radius){
        this.radius = radius > 0? radius : 1;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
