public abstract class Vechicle {
    private String name;
    private int speed;

    public Vechicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public Vechicle(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public abstract void displayInfo();

    public void start(){
        System.out.println("Vechicle is starting");
    }
}
