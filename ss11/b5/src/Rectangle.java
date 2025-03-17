public class Rectangle implements IColorable{
    private String color;
    private int w;
    private int h;

    public Rectangle(int w, int h){
        this.w = w;
        this.h = h;
    }

    public Rectangle(){
    }

    @Override
    public String getColor(){
        return color;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    public int getW(){
        return w;
    }

    public void setW(int w){
        this.w = w;
    }

    public int getH(){
        return h;
    }

    public void setH(int h){
        this.h = h;
    }
}
