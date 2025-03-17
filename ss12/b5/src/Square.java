public class Square extends Shape {
    private int edge;

    public Square(int edge){
        this.edge = edge;
    }

    public Square(){
    }

    public int getEdge(){
        return edge;
    }

    public void setEdge(int edge){
        this.edge = edge;
    }

    @Override
    public double area(){
        return Math.pow(this.edge, 2);
    }

    @Override
    public String toString(){
        return "hình vuông";
    }
}
