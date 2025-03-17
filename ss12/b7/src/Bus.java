public class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bus is driving along the highway");
    }

    @Override
    public void sound() {
        System.out.println("Bus horn: Honk Honk!");
    }
}
