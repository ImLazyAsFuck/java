public class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;

    public MoveablePoint(double xSpeed, double ySpeed){
        this.xSpeed = xSpeed > 0? xSpeed : 1;
        this.ySpeed = ySpeed > 0? ySpeed : 1;
    }

    public MoveablePoint(){}

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed){
        super(x, y);
        this.xSpeed = xSpeed > 0? xSpeed : 1;
        this.ySpeed = ySpeed > 0? ySpeed : 1;
    }

    public double getxSpeed(){
        return xSpeed;
    }

    public void setxSpeed(double xSpeed){
        this.xSpeed = xSpeed > 0? xSpeed : 1;
    }

    public double getySpeed(){
        return ySpeed;
    }

    public void setySpeed(double ySpeed){
        this.ySpeed = ySpeed > 0? ySpeed : 1;
    }

    public void move(){
        this.setX(super.getX() + this.xSpeed);
        this.setY(super.getY() + this.ySpeed);
    }

    @Override
    public String toString(){
        return "MoveablePoint(" + super.getX() + ", " + super.getY() + ") with speed " + "(" + xSpeed + ", " + ySpeed + ")";
    }
}
