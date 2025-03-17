public class Bike extends Vechicle{
    public Bike(String name, int speed){
        super(name, speed);
    }

    public Bike(){
    }

    public void displayInfo(){
        System.out.println("Tên xe: " + super.getName());
        System.out.println("Tốc độ xe: " + super.getSpeed());
    }
}
