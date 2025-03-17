public class Main{
    public static void main(String[] args) {
        Product electronics = new Electronics("Laptop", 1000);
        Product clothing = new Clothing("T-Shirt", 50);
        Product food = new Food("Apple", 2);

        System.out.println("Final Price of Electronics: $" + electronics.getFinalPrice());
        System.out.println("Final Price of Electronics (200 items): $" + electronics.getFinalPrice(200));
        System.out.println("Final Price of Clothing: $" + clothing.getFinalPrice());
        System.out.println("Final Price of Clothing (50 items): $" + clothing.getFinalPrice(50));
        System.out.println("Final Price of Food: $" + food.getFinalPrice());
        System.out.println("Final Price of Food (150 items): $" + food.getFinalPrice(150));
    }
}