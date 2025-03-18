import java.util.Scanner;
import java.util.Arrays;

public class ProductManager {
    private static final int MAX_PRODUCTS = 100;
    private final Product[] products = new Product[MAX_PRODUCTS];
    private int currentIndex = 0;

    public void addProduct(Scanner input) {
        if (currentIndex >= MAX_PRODUCTS) {
            System.out.println("Product list is full!");
            return;
        }
        Product newProduct = new Product();
        newProduct.inputData(input);
        products[currentIndex++] = newProduct;
    }

    public void updateProduct(Scanner input) {
        System.out.print("Enter product ID to update: ");
        String productId = input.nextLine();
        Product product = findProductById(productId);
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        while (true) {
            System.out.println("\nChoose attribute to update:");
            System.out.println("1. Name | 2. Import Price | 3. Export Price | 4. Title | 5. Description");
            System.out.println("6. Quantity | 7. Category ID | 8. Status | 9. Exit");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(input.nextLine());

            if (choice == 9) break;

            switch (choice) {
                case 1 -> updateProductName(input, product);
                case 2 -> updateProductImportPrice(input, product);
                case 3 -> updateProductExportPrice(input, product);
                case 4 -> updateProductTitle(input, product);
                case 5 -> updateProductDescription(input, product);
                case 6 -> updateProductQuantity(input, product);
                case 7 -> updateProductCategory(input, product);
                case 8 -> updateProductStatus(input, product);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private Product findProductById(String productId) {
        return Arrays.stream(products, 0, currentIndex)
                .filter(p -> p.getProductId().equals(productId))
                .findFirst().orElse(null);
    }

    private void updateProductName(Scanner input, Product product) {
        System.out.print("Enter new product name (10-100 chars): ");
        String name = input.nextLine();
        if (name.length() >= 10 && name.length() <= 100) {
            product.setProductName(name);
            System.out.println("Updated successfully!");
        } else System.out.println("Invalid name length!");
    }

    private void updateProductImportPrice(Scanner input, Product product) {
        System.out.print("Enter new import price (>0): ");
        float price = Float.parseFloat(input.nextLine());
        if (price > 0) {
            product.setProductImportPrice(price);
            System.out.println("Updated successfully!");
        } else System.out.println("Invalid price!");
    }

    private void updateProductExportPrice(Scanner input, Product product) {
        System.out.print("Enter new export price (> import price + INTEREST): ");
        float price = Float.parseFloat(input.nextLine());
        if (price > product.getProductImportPrice() + IApp.INTEREST) {
            product.setProductExportPrice(price);
            System.out.println("Updated successfully!");
        } else System.out.println("Invalid export price!");
    }

    private void updateProductTitle(Scanner input, Product product) {
        System.out.print("Enter new title (max 200 chars): ");
        String title = input.nextLine();
        if (title.length() <= 200) {
            product.setProductTitle(title);
            System.out.println("Updated successfully!");
        } else System.out.println("Title too long!");
    }

    private void updateProductDescription(Scanner input, Product product) {
        System.out.print("Enter new description: ");
        product.setProductDescription(input.nextLine());
        System.out.println("Updated successfully!");
    }

    private void updateProductQuantity(Scanner input, Product product) {
        System.out.print("Enter new quantity: ");
        int qty = Integer.parseInt(input.nextLine());
        if (qty >= 0) {
            product.setStock(qty);
            System.out.println("Updated successfully!");
        } else System.out.println("Quantity can't be negative!");
    }

    private void updateProductCategory(Scanner input, Product product) {
        System.out.print("Enter new category ID: ");
        product.setCategoryId(Integer.parseInt(input.nextLine()));
        System.out.println("Updated successfully!");
    }

    private void updateProductStatus(Scanner input, Product product) {
        System.out.print("Enter new status (0: Active, 1: Out of Stock, 2: Inactive): ");
        int status = Integer.parseInt(input.nextLine());
        if (status >= 0 && status <= 2) {
            product.setProductStatus(status);
            System.out.println("Updated successfully!");
        } else System.out.println("Invalid status!");
    }

    public void deleteProduct(Scanner input) {
        System.out.print("Enter product name: ");
        String name = input.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getProductName().equals(name)) {
                System.arraycopy(products, i + 1, products, i, currentIndex - i - 1);
                currentIndex--;
                System.out.println("Product deleted.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void displayProducts() {
        if (currentIndex == 0) System.out.println("No products available.");
        else Arrays.stream(products, 0, currentIndex).forEach(Product::displayData);
    }

    public void sortProductsByPriceDescending() {
        Arrays.sort(products, 0, currentIndex, (a, b) -> Float.compare(b.getProductExportPrice(), a.getProductExportPrice()));
        displayProducts();
    }

    public void sellProduct(Scanner input) {
        System.out.print("Enter product ID to sell: ");
        String productId = input.nextLine();
        System.out.print("Enter quantity to sell: ");
        int quantity = Integer.parseInt(input.nextLine());
        // Logic to reduce stock and process sale
        System.out.println("Product sold successfully!");
    }

    public void amountProductByCategory() {
        // Logic to count products by category
        System.out.println("Displaying product count by category...");
    }

    public void productMenu() {
        System.out.println("Product Management Menu:");
        System.out.println("1. Display Products");
        System.out.println("2. Add Product");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Find Product by Name or Title");
        System.out.println("6. Find Product by Price");
        System.out.println("7. Sort Products by Price Descending");
        System.out.println("8. Sell Product");
        System.out.println("9. Amount of Products by Category");
        System.out.println("10. Exit");
    }

    public void findProductByNameOrTitle(Scanner input) {
        System.out.print("Enter product name or title: ");
        String search = input.nextLine();
        // Logic to find products by name or title
        System.out.println("Displaying search results...");
    }

    public void findProductByPrice(Scanner input) {
        System.out.print("Enter min price: ");
        float min = Float.parseFloat(input.nextLine());
        System.out.print("Enter max price: ");
        float max = Float.parseFloat(input.nextLine());
        Arrays.stream(products, 0, currentIndex)
                .filter(p -> p.getProductExportPrice() >= min && p.getProductExportPrice() <= max)
                .forEach(Product::displayData);
    }

    public void displayProduct(){
        for (int i = 0; i <= currentIndex; i++) {
            products[i].displayData();
        }
    }
}
