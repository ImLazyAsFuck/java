public class Garage{
    private Car[] cars;
    private int count;

    public Garage(int size) {
        this.cars = new Car[size];
        this.count = 0;
    }

    public void addCar(Car car) {
        if (count < cars.length) {
            cars[count++] = car;
        } else {
            System.out.println("Garage is full!");
        }
    }

    public void manageCars() {
        for (int i = 0; i < count; i++) {
            System.out.println(cars[i].start());
            System.out.println(cars[i].stop());
            System.out.println(cars[i].refuel());
            System.out.println();
        }
    }
}
