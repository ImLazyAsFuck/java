public class Car extends Vechicle {
    public Car(String name, int speed){
        super(name, speed);
    }

    public Car(){
    }

    public void displayInfo(){
        System.out.println("Tên xe: " + super.getName());
        System.out.println("Tốc độ xe: " + super.getSpeed());
    }
}
