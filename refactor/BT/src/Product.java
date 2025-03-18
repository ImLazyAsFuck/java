import java.util.Scanner;

public class Product implements IApp{
    private String productId;
    private String productName;
    private float productImportPrice;
    private float productExportPrice;
    private String productTitle;
    private String productDescription;
    private int stock;
    private int categoryId;
    private int productStatus;

    public Product(String productId, String productName, float productImportPrice, float productExportPrice, String productTitle, String productDescription, int stock, int categoryId, int productStatus){
        this.productId = productId;
        this.productName = productName;
        this.productImportPrice = productImportPrice;
        this.productExportPrice = productExportPrice;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.stock = stock;
        this.categoryId = categoryId;
        this.productStatus = productStatus;
    }

    public Product(){
    }

    public String getProductId(){
        return productId;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public float getProductImportPrice(){
        return productImportPrice;
    }

    public void setProductImportPrice(float productImportPrice){
        this.productImportPrice = productImportPrice;
    }

    public float getProductExportPrice(){
        return productExportPrice;
    }

    public void setProductExportPrice(float productExportPrice){
        this.productExportPrice = productExportPrice;
    }

    public String getProductTitle(){
        return productTitle;
    }

    public void setProductTitle(String productTitle){
        this.productTitle = productTitle;
    }

    public String getProductDescription(){
        return productDescription;
    }

    public void setProductDescription(String productDescription){
        this.productDescription = productDescription;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public int getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(int categoryId){
        this.categoryId = categoryId;
    }

    public int getProductStatus(){
        return productStatus;
    }

    public void setProductStatus(int productStatus){
        this.productStatus = productStatus;
    }

    @Override
    public void inputData(Scanner input){
       inputProductId(input);
       inputProductName(input);
       inputProductImportPrice(input);
       inputProductExportPrice(input);
       inputProductTitle(input);
       System.out.print("Enter product description: ");
       this.productDescription = input.nextLine();
       System.out.print("Enter product stock: ");
       this.setStock(Integer.parseInt(input.nextLine()));
       System.out.print("Enter category ID: ");
       this.setCategoryId(Integer.parseInt(input.nextLine()));
       System.out.print("Enter product status: ");
       this.setProductStatus(Integer.parseInt(input.nextLine()));
    }

    public void inputProductExportPrice(Scanner input){
        do{
            System.out.print("Enter product export price: ");
            float productExportPrice = Float.parseFloat(input.nextLine());
            if(validProductExportPrice(productExportPrice)){
                this.setProductExportPrice(productExportPrice);
                break;
            }
            System.out.println("Invalid product export price");
        }while(true);
    }

    public boolean validProductExportPrice(Float productExportPrice){
        return productExportPrice >= INTEREST;
    }

    public void inputProductImportPrice(Scanner input){
        do{
            System.out.print("Enter product import price: ");
            float productImportPrice = Float.parseFloat(input.nextLine());
            if(validProductImportPrice(productImportPrice)){
                this.setProductImportPrice(productImportPrice);
                break;
            }
            System.out.println("Invalid product import price");
        }while(true);
    }

    public boolean validProductImportPrice(float productImportPrice){
        return productImportPrice > 0;
    }

    public void inputProductTitle(Scanner input){
        do{
            System.out.print("Enter product title: ");
            String productTitle = input.nextLine();
            if(validProductTitle(productTitle)){
                this.setProductTitle(productTitle);
                break;
            }
            System.out.println("Invalid product title");
        }while(true);
    }

    public boolean validProductTitle(String productTitle){
        return productTitle.length() < 200;
    }

    public void inputProductName(Scanner input){
        do{
            System.out.print("Enter Product Name: ");
            String newProductName = input.nextLine();
            if(validProductName(newProductName)){
                this.setProductName(newProductName);
                break;
            }
        }while(true);
    }

    public boolean validProductName(String productName){
        return productName.length() >= 10 && productName.length() <= 100;
    }

    public void inputProductId(Scanner input){
        do{
            System.out.print("Enter Product ID: ");
            String newProductId = input.nextLine();
            if(validProductId(newProductId)){
                this.setProductId(newProductId);
                break;
            }
        }while(true);
    }

    public boolean validProductId(String productId){
        return productId.matches("^[CET](?!.*(.).*\\1)[A-Z]{4}$\n");
    }

    @Override
    public void displayData(){
        System.out.println("Product ID: " + this.getProductId());
        System.out.println("Product Name: " + this.getProductName());
        System.out.println("Product Import Price: " + this.getProductImportPrice());
        System.out.println("Product Export Price: " + this.getProductExportPrice());
        System.out.println("Product Title: " + this.getProductTitle());
        System.out.println("Product Description: " + this.getProductDescription());
        System.out.println("Product Stock: " + this.getStock());
        System.out.println("Product Category ID: " + this.getCategoryId());
        System.out.println("Product Status: " + this.getProductStatus());
    }
}
