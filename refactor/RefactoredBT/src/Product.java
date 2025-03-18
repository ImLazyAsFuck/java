import java.util.Scanner;

public class Product implements IApp {
    private String productId;
    private String productName;
    private float productImportPrice;
    private float productExportPrice;
    private String productTitle;
    private String productDescription;
    private int stock;
    private int categoryId;
    private int productStatus;

    public Product(String productId, String productName, float productImportPrice, float productExportPrice,
                   String productTitle, String productDescription, int stock, int categoryId, int productStatus) {
        setProductId(productId);
        setProductName(productName);
        setProductImportPrice(productImportPrice);
        setProductExportPrice(productExportPrice);
        setProductTitle(productTitle);
        setProductDescription(productDescription);
        setStock(stock);
        setCategoryId(categoryId);
        setProductStatus(productStatus);
    }

    public Product() {}

    public String getProductId() { return productId; }
    public void setProductId(String productId) {
        if (validProductId(productId)) this.productId = productId;
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) {
        if (validProductName(productName)) this.productName = productName;
    }

    public float getProductImportPrice() { return productImportPrice; }
    public void setProductImportPrice(float productImportPrice) {
        if (validProductImportPrice(productImportPrice)) this.productImportPrice = productImportPrice;
    }

    public float getProductExportPrice() { return productExportPrice; }
    public void setProductExportPrice(float productExportPrice) {
        if (validProductExportPrice(productExportPrice)) this.productExportPrice = productExportPrice;
    }

    public String getProductTitle() { return productTitle; }
    public void setProductTitle(String productTitle) {
        if (validProductTitle(productTitle)) this.productTitle = productTitle;
    }

    public String getProductDescription() { return productDescription; }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public int getProductStatus() { return productStatus; }
    public void setProductStatus(int productStatus) { this.productStatus = productStatus; }

    @Override
    public void inputData(Scanner input) {
        inputProductId(input);
        inputProductName(input);
        inputProductImportPrice(input);
        inputProductExportPrice(input);
        inputProductTitle(input);

        System.out.print("Enter product description: ");
        setProductDescription(input.nextLine());

        System.out.print("Enter product stock: ");
        setStock(getValidInteger(input));

        System.out.print("Enter category ID: ");
        setCategoryId(getValidInteger(input));

        System.out.print("Enter product status: ");
        setProductStatus(getValidInteger(input));
    }

    private void inputProductExportPrice(Scanner input) {
        do {
            System.out.print("Enter product export price: ");
            float price = getValidFloat(input);
            if (validProductExportPrice(price)) {
                setProductExportPrice(price);
                break;
            }
            System.out.println("Invalid product export price.");
        } while (true);
    }

    private void inputProductImportPrice(Scanner input) {
        do {
            System.out.print("Enter product import price: ");
            float price = getValidFloat(input);
            if (validProductImportPrice(price)) {
                setProductImportPrice(price);
                break;
            }
            System.out.println("Invalid product import price.");
        } while (true);
    }

    private void inputProductTitle(Scanner input) {
        do {
            System.out.print("Enter product title: ");
            String title = input.nextLine();
            if (validProductTitle(title)) {
                setProductTitle(title);
                break;
            }
            System.out.println("Invalid product title.");
        } while (true);
    }

    private void inputProductName(Scanner input) {
        do {
            System.out.print("Enter product name: ");
            String name = input.nextLine();
            if (validProductName(name)) {
                setProductName(name);
                break;
            }
            System.out.println("Invalid product name.");
        } while (true);
    }

    private void inputProductId(Scanner input) {
        do {
            System.out.print("Enter product ID: ");
            String id = input.nextLine();
            if (validProductId(id)) {
                setProductId(id);
                break;
            }
            System.out.println("Invalid product ID.");
        } while (true);
    }

    private boolean validProductExportPrice(float price) {
        return price >= productImportPrice * 1.2;
    }

    private boolean validProductImportPrice(float price) {
        return price > 0;
    }

    private boolean validProductTitle(String title) {
        return title.length() <= 200;
    }

    private boolean validProductName(String name) {
        return name.length() >= 10 && name.length() <= 100;
    }

    private boolean validProductId(String id) {
        return id.matches("^[CET](?!.*(.).*\\1)[A-Z]{4}$");
    }

    @Override
    public void displayData() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Product Import Price: " + getProductImportPrice());
        System.out.println("Product Export Price: " + getProductExportPrice());
        System.out.println("Product Title: " + getProductTitle());
        System.out.println("Product Description: " + getProductDescription());
        System.out.println("Product Stock: " + getStock());
        System.out.println("Product Category ID: " + getCategoryId());
        System.out.println("Product Status: " + getProductStatus());
    }

    private int getValidInteger(Scanner input) {
        while (true) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    private float getValidFloat(Scanner input) {
        while (true) {
            try {
                return Float.parseFloat(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
