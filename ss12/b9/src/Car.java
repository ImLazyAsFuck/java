public class Car extends Vehicle{
    public Car(){
    }

    @Override
    public void move() {
        System.out.println("Car is driving on the road");
    }

    @Override
    public void sound(){
        System.out.println("Car horn: Beep Beep!");
    }
}
