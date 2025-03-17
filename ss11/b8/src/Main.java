public class Main{
    public static void main(String[] args) {
        Garage garage = new Garage(10);

        Car tesla = new ElectricCar("Tesla Model 3", 2023, 50000);
        Car toyota = new GasCar("Toyota Camry", 2022, 35000);

        garage.addCar(tesla);
        garage.addCar(toyota);

        garage.manageCars();
    }
}