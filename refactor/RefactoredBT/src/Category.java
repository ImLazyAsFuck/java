import java.util.Scanner;

public class Category implements IApp {
    private static int categoryIdCounter = 1;
    private int categoryId;
    private String categoryName;
    private int categoryPriority;
    private String categoryDescription;
    private boolean categoryStatus;

    private static final int MIN_TEXT = 6;
    private static final int MAX_TEXT = 50;
    private static final int TEXT_LIMIT = 255;

    public Category(String categoryName, int categoryPriority, String categoryDescription, boolean categoryStatus) {
        this.categoryId = categoryIdCounter++;
        this.categoryName = categoryName;
        this.categoryPriority = categoryPriority;
        this.categoryDescription = categoryDescription;
        this.categoryStatus = categoryStatus;
    }

    public Category() {
        this.categoryId = categoryIdCounter++;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryPriority() {
        return categoryPriority;
    }

    public void setCategoryPriority(int categoryPriority) {
        this.categoryPriority = categoryPriority;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public boolean isCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(boolean categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    private boolean isValidCategoryName(String categoryName) {
        return categoryName.length() >= MIN_TEXT && categoryName.length() <= MAX_TEXT;
    }

    private boolean isValidCategoryDescription(String categoryDescription) {
        return categoryDescription.length() <= TEXT_LIMIT;
    }

    @Override
    public void inputData(Scanner input) {
        this.categoryId = categoryIdCounter++;

        inputCategoryName(input);

        System.out.print("Please enter the category priority: ");
        while (true) {
            try {
                categoryPriority = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a valid number: ");
            }
        }

        inputCategoryDescription(input);

        System.out.print("Please enter the category status (true/false): ");
        categoryStatus = Boolean.parseBoolean(input.nextLine());
    }

    private void inputCategoryName(Scanner input) {
        while (true) {
            System.out.print("Please enter the category name: ");
            String newCategoryName = input.nextLine();
            if (isValidCategoryName(newCategoryName)) {
                this.setCategoryName(newCategoryName);
                break;
            }
            System.out.println("Invalid Category Name. Name must be between " + MIN_TEXT + " and " + MAX_TEXT + " characters.");
        }
    }

    private void inputCategoryDescription(Scanner input) {
        while (true) {
            System.out.print("Please enter the category description: ");
            String newDescription = input.nextLine();
            if (isValidCategoryDescription(newDescription)) {
                this.setCategoryDescription(newDescription);
                break;
            }
            System.out.println("Invalid Category Description. Description must not exceed " + TEXT_LIMIT + " characters.");
        }
    }

    @Override
    public void displayData() {
        System.out.println("Category ID: " + categoryId);
        System.out.println("Category Name: " + categoryName);
        System.out.println("Category Priority: " + categoryPriority);
        System.out.println("Description: " + categoryDescription);
        System.out.println("Category Status: " + (categoryStatus ? "Active" : "Inactive"));
    }
}
