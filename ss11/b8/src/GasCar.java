public class GasCar extends Car{
    public GasCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    public String start() {
        return "Xe chạy xăng " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đã khởi động với tiếng động cơ.";
    }

    @Override
    public String stop() {
        return "Xe chạy xăng " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đã dừng và động cơ tắt";
    }

    @Override
    public String refuel() {
        return "Xe chạy xăng " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đang được đổ xăng...";
    }
}
