import java.util.Scanner;

public class ShopManagement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CategoryManager categoryManager = new CategoryManager();
        ProductManager productManager = new ProductManager();

        do{
            shopMenu();
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    categoryManager.categoryMenu();
                    categoryChoice(input, categoryManager);
                    break;
                case 2:
                    if(categoryManager.isEmptyCategory()){
                        System.out.println("Category is empty");
                        break;
                    }
                    productManager.productMenu();
                    productChoice(input, productManager);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice (Please choose from 1 to 3)");
            }
        }while(true);
    }

    public static void categoryChoice(Scanner input, CategoryManager categoryManager){
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());

        switch(choice){
            case 1:
                categoryManager.displayCategories();
                break;
            case 2:
                categoryManager.addCategory(input);
                break;
            case 3:
                categoryManager.updateCategory(input);
                break;
            case 4:
                categoryManager.deleteCategory(input);
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid choice (Please choose from 1 to 6)");
        }
    }

    public static void productChoice(Scanner input, ProductManager productManager){
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());

        switch(choice){
            case 1:
                productManager.displayProduct();
                break;
            case 2:
                productManager.addProduct(input);
                break;
            case 3:
                productManager.updateProduct(input);
                break;
            case 4:
                productManager.deleteProduct(input);
                break;
            case 5:
                productManager.findProductByNameOrTitle(input);
                break;
            case 6:
                productManager.findProductByPrice(input);
                break;
            case 7:
                productManager.sortProductsByPriceDescending();
                break;
            case 8:
                productManager.sellProduct(input);
                break;
            case 9:
                productManager.amountProductByCategory();
                break;
            case 10:
                return;
            default:
                System.out.println("Invalid choice (Please choose from 1 to 10)");
        }
    }

    public static void shopMenu(){
        System.out.println("1. CategoryManager");
        System.out.println("2. ProductManager");
        System.out.println("3. Exit");
    }
}