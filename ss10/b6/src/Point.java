public class Point{
    private double x;
    private double y;

    public Point(){
    }

    public Point(double x, double y){
        this.x = x > 0? x : 1;
        this.y = y > 0? y : 1;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x > 0? x : 1;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y > 0? y : 1;
    }

    @Override
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
}
