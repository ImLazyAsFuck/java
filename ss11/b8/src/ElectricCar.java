public class ElectricCar extends Car{
    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return "Xe điện " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đã khởi động không tiếng ồn";
    }

    @Override
    public String stop() {
        return "Xe điện " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đã dừng và ngắt kết nối động cơ.";
    }

    @Override
    public String refuel() {
        return "Xe điện " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đang sạc điện…";
    }
}
