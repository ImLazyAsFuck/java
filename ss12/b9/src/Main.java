public class Main{
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus(40);
        Airplane airplane = new Airplane(30000);

        // Call methods
        car.move();
        car.sound();
        car.move(2, 60);

        bike.move();
        bike.sound();
        bike.move(1, 20);

        bus.move();
        bus.sound();
        bus.move(3, 50);
        System.out.println("Bus has " + ((Bus) bus).getSeats() + " seats.");

        airplane.move();
        airplane.sound();
        airplane.move(5, 800);
        System.out.println("Airplane is flying at altitude: " + ((Airplane) airplane).getAltitude() + " feet.");
    }

}