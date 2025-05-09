public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(){
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public double area(){
        return this.width * this.height;
    }

    @Override
    public String toString(){
        return "hình chữ nhật";
    }
}
