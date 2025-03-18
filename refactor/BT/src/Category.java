import java.util.Scanner;

public class Category implements IApp{
    private int categoryId = 1;
    private String categoryName;
    private int categoryPriority;
    private String categoryDescription;
    private boolean categoryStatus;

    final int MIN_TEXT = 6;
    final int MAX_TEXT = 50;
    final int TEXT_LIMIT = 255;

    public Category(String categoryName, int categoryPriority, String categoryDescription, boolean categoryStatus){
        this.categoryName = categoryName;
        this.categoryPriority = categoryPriority;
        this.categoryDescription = categoryDescription;
        this.categoryStatus = categoryStatus;
    }

    public Category(){
    }

    public int getCategoryId(){
        return categoryId;
    }

    public void setCategoryId(){
        this.categoryId++;
    }

    public String getCategoryName(){
        return categoryName;
    }

    public void setCategoryName(String categoryName){
        this.categoryName = categoryName;
    }

    public int getCategoryPriority(){
        return categoryPriority;
    }

    public void setCategoryPriority(int categoryPriority){
        this.categoryPriority = categoryPriority;
    }

    public String getCategoryDescription(){
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription){
        this.categoryDescription = categoryDescription;
    }

    public boolean isCategoryStatus(){
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus){
        this.categoryStatus = categoryStatus;
    }

    public boolean isValidCategoryName(String categoryName){
        return categoryName.length() > MIN_TEXT && categoryName.length() < MAX_TEXT;
    }

    @Override
    public void inputData(Scanner input){
        this.setCategoryId();
        inputCategoryName(input);
        System.out.print("Please enter the category categoryPriority: ");
        categoryPriority = Integer.parseInt(input.nextLine());
        inputCategoryDescription(input);
        System.out.print("Please enter the category categoryStatus: ");
        categoryStatus = Boolean.parseBoolean(input.nextLine());
    }

    public void inputCategoryName(Scanner input){
        do{
            System.out.print("Please enter the category name: ");
            String newCategoryName = input.nextLine();
            if(isValidCategoryName(newCategoryName)){
                this.setCategoryName(newCategoryName);
                break;
            }
            System.out.println("Invalid Category Name");
        }while(true);
    }

    public void inputCategoryDescription(Scanner input){
        do{
            System.out.print("Please enter the categoryDescription: ");
            String newDescription = input.nextLine();
            if(isValidCategoryDescription(newDescription)){
                this.setCategoryDescription(newDescription);
                break;
            }
            System.out.println("Invalid Category Priority");
        }while(true);
    }

    public boolean isValidCategoryDescription(String categoryDescription){
        return categoryDescription.length() <= TEXT_LIMIT;
    }

    @Override
    public void displayData(){
        System.out.println("Category ID: " + categoryId);
        System.out.println("Category Name: " + categoryName);
        System.out.println("Category Priority: " + categoryPriority);
        System.out.println("Description: " + categoryDescription);
        System.out.println("Category Status: " + categoryStatus);
    }
}
