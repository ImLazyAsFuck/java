public class Cylinder extends Circle{
    private int height;

    public Cylinder(){}

    public Cylinder(int height){
        this.height = height > 0? height : 1;
    }

    public Cylinder(int radius, int width, int height){
        super(radius);
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height > 0? height : 1;
    }

    public double getVolume(){
        return (Math.PI * Math.pow(super.getRadius(), 2) * this.getHeight());
    }
}
