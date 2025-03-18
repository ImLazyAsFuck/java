import java.util.Scanner;

public class ShopManagement {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CategoryManager categoryManager = new CategoryManager();
        ProductManager productManager = new ProductManager();

        while (true) {
            shopMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> categoryChoice(categoryManager);
                case 2 -> {
                    if (categoryManager.isEmptyCategory()) {
                        System.out.println("Category is empty");
                    } else {
                        productChoice(productManager);
                    }
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice (Please choose from 1 to 3)");
            }
        }
    }

    private static void categoryChoice(CategoryManager categoryManager) {
        categoryManager.categoryMenu();
        int choice = getUserChoice();

        switch (choice) {
            case 1 -> categoryManager.displayCategories();
            case 2 -> categoryManager.addCategory(input);
            case 3 -> categoryManager.updateCategory(input);
            case 4 -> categoryManager.deleteCategory(input);
            case 5 -> {}
            default -> System.out.println("Invalid choice (Please choose from 1 to 5)");
        }
    }

    private static void productChoice(ProductManager productManager) {
        productManager.productMenu();
        int choice = getUserChoice();

        switch (choice) {
            case 1 -> productManager.displayProduct();
            case 2 -> productManager.addProduct(input);
            case 3 -> productManager.updateProduct(input);
            case 4 -> productManager.deleteProduct(input);
            case 5 -> productManager.findProductByNameOrTitle(input);
            case 6 -> productManager.findProductByPrice(input);
            case 7 -> productManager.sortProductsByPriceDescending();
            case 8 -> productManager.sellProduct(input);
            case 9 -> productManager.amountProductByCategory();
            case 10 -> {}
            default -> System.out.println("Invalid choice (Please choose from 1 to 10)");
        }
    }

    private static void shopMenu() {
        System.out.println("1. Category Manager");
        System.out.println("2. Product Manager");
        System.out.println("3. Exit");
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Trả về giá trị không hợp lệ
        }
    }
}
