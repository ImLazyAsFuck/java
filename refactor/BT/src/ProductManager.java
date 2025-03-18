import java.util.Scanner;

public class ProductManager{
    private final Product[] products = new Product[100];
    private int currentIndex = 0;

    public void addProduct(Scanner input){
        if(currentIndex < products.length){
            Product newProduct = new Product();
            newProduct.inputData(input);
            products[currentIndex++] = newProduct;
        }else{
            System.out.println("List is full");
        }
    }

    public void updateProduct(Scanner input) {
        System.out.print("Enter product ID to update: ");
        String productId = input.nextLine();

        Product productToUpdate = null;
        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getProductId().equals(productId)) {
                productToUpdate = products[i];
                break;
            }
        }

        if (productToUpdate == null) {
            System.out.println("Product not found.");
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\nChoose attribute to update:");
            System.out.println("1. Product Name");
            System.out.println("2. Product Import Price");
            System.out.println("3. Product Export Price");
            System.out.println("4. Product Title");
            System.out.println("5. Product Description");
            System.out.println("6. Product Quantity");
            System.out.println("7. Product Category ID");
            System.out.println("8. Product Status");
            System.out.println("9. Exit");
            System.out.print("Your choice: ");

            int choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter new product name (10-100 characters, unique): ");
                    String newProductName = input.nextLine();
                    if (newProductName.length() >= 10 && newProductName.length() <= 100) {
                        productToUpdate.setProductName(newProductName);
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Invalid product name length!");
                    }
                    break;

                case 2:
                    System.out.print("Enter new product import price (>0): ");
                    float newProductImportPrice = Float.parseFloat(input.nextLine());
                    if (newProductImportPrice > 0) {
                        productToUpdate.setProductImportPrice(newProductImportPrice);
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Invalid product import price!");
                    }
                    break;

                case 3:
                    System.out.print("Enter new product export price (> import price + INTEREST): ");
                    float newProductExportPrice = Float.parseFloat(input.nextLine());
                    if (newProductExportPrice > productToUpdate.getProductImportPrice() + IApp.INTEREST) {
                        productToUpdate.setProductExportPrice(newProductExportPrice);
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Product export price must be greater than import price + INTEREST!");
                    }
                    break;

                case 4:
                    System.out.print("Enter new product title (max 200 characters): ");
                    String newProductTitle = input.nextLine();
                    if (newProductTitle.length() <= 200) {
                        productToUpdate.setProductTitle(newProductTitle);
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Product title is too long!");
                    }
                    break;

                case 5:
                    System.out.print("Enter new product description: ");
                    String newProductDescription = input.nextLine();
                    productToUpdate.setProductDescription(newProductDescription);
                    System.out.println("Updated successfully!");
                    break;

                case 6:
                    System.out.print("Enter new product quantity: ");
                    int newProductQuantity = Integer.parseInt(input.nextLine());
                    if (newProductQuantity >= 0) {
                        productToUpdate.setStock(newProductQuantity);
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Product quantity cannot be negative!");
                    }
                    break;

                case 7:
                    System.out.print("Enter new product category ID: ");
                    int newProductCategoryId = Integer.parseInt(input.nextLine());
                    productToUpdate.setCategoryId(newProductCategoryId);
                    System.out.println("Updated successfully!");
                    break;

                case 8:
                    System.out.print("Enter new product status (0: Active, 1: Out of Stock, 2: Inactive): ");
                    int newProductStatus = Integer.parseInt(input.nextLine());
                    if (newProductStatus >= 0 && newProductStatus <= 2) {
                        productToUpdate.setProductStatus(newProductStatus);
                        System.out.println("Updated successfully!");
                    } else {
                        System.out.println("Invalid product status!");
                    }
                    break;

                case 9:
                    running = false;
                    System.out.println("Exiting update menu.");
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public void deleteProduct(Scanner input){
        System.out.print("Enter product name: ");
        String productName = input.nextLine();
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(productName.equals(products[i].getProductName())){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Can't find product with name " + productName);
            return;
        }
        for(int i = found; i < currentIndex; i++){
            products[i] = products[i + 1];
        }
        currentIndex--;
    }


    public void displayProduct(){
        for(int i = 0; i < currentIndex; i++){
            products[i].displayData();
            System.out.println();
        }
    }

    public void productMenu(){
        System.out.println("Product Management");
        System.out.println("1. Product list");
        System.out.println("2. Add category");
        System.out.println("3. Update product");
        System.out.println("4. Delete product");
        System.out.println("5. Find product by name or title");
        System.out.println("6. Find product by price");
        System.out.println("7. Sort products by price descending");
        System.out.println("8. Sell product");
        System.out.println("9. Amount product by category");
        System.out.println("10. Exit");
    }

    public void findProductByNameOrTitle(Scanner input) {
        System.out.print("Enter product name or title to search: ");
        String keyword = input.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getProductName().contains(keyword) || products[i].getProductTitle().contains(keyword)) {
                products[i].displayData();
            }
        }
    }

    public void findProductByPrice(Scanner input) {
        System.out.print("Enter min price: ");
        float minPrice = Float.parseFloat(input.nextLine());
        System.out.print("Enter max price: ");
        float maxPrice = Float.parseFloat(input.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getProductExportPrice() >= minPrice && products[i].getProductExportPrice() <= maxPrice) {
                products[i].displayData();
            }
        }
    }

    public void sortProductsByPriceDescending() {
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if (products[i].getProductExportPrice() < products[j].getProductExportPrice()) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        displayProduct();
    }

    public void amountProductByCategory() {
        int[] categoryCount = new int[100];
        for (int i = 0; i < currentIndex; i++) {
            categoryCount[products[i].getCategoryId()]++;
        }
        for (int i = 0; i < categoryCount.length; i++) {
            if (categoryCount[i] > 0) {
                System.out.println("Category " + i + ": " + categoryCount[i] + " products");
            }
        }
    }

    public void sellProduct(Scanner input) {
        System.out.print("Enter product ID to sell: ");
        String productId = input.nextLine();

        for (int i = 0; i < currentIndex; i++) {
            if (products[i].getProductId().equals(productId)) {
                System.out.print("Enter quantity to sell: ");
                int quantity = Integer.parseInt(input.nextLine());

                if (products[i].getStock() >= quantity) {
                    products[i].setStock(products[i].getStock() - quantity);
                    System.out.println("Product sold successfully!");
                } else {
                    System.out.println("Not enough stock available!");
                }
                return;
            }
        }
        System.out.println("Product not found!");
    }
}
