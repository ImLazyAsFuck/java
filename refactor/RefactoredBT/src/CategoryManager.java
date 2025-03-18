import java.util.Scanner;

public class CategoryManager {
    private static final int MAX_CATEGORIES = 100;
    private final Category[] categories = new Category[MAX_CATEGORIES];
    private int currentIndex = 0;

    public void addCategory(Scanner input) {
        if (currentIndex < MAX_CATEGORIES) {
            Category newCategory = new Category();
            newCategory.inputData(input);
            categories[currentIndex++] = newCategory;
        } else {
            System.out.println("Category list is full.");
        }
    }

    private int findCategoryIndexByName(String categoryName) {
        for (int i = 0; i < currentIndex; i++) {
            if (categories[i].getCategoryName().equalsIgnoreCase(categoryName)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isUniqueCategoryName(String categoryName) {
        return findCategoryIndexByName(categoryName) != -1;
    }

    public void displayCategories() {
        if (currentIndex == 0) {
            System.out.println("No categories available.");
            return;
        }
        for (int i = 0; i < currentIndex; i++) {
            categories[i].displayData();
            System.out.println("----------------------");
        }
    }

    public void updateCategory(Scanner input) {
        System.out.print("Enter category name to update: ");
        String name = input.nextLine();
        int index = findCategoryIndexByName(name);

        if (index == -1) {
            System.out.println("Category not found.");
            return;
        }
        chooseUpdate(input, index);
    }

    public void deleteCategory(Scanner input) {
        System.out.print("Enter category name to delete: ");
        String categoryName = input.nextLine();
        int index = findCategoryIndexByName(categoryName);

        if (index == -1) {
            System.out.println("Category not found.");
            return;
        }

        for (int i = index; i < currentIndex - 1; i++) {
            categories[i] = categories[i + 1];
        }
        categories[--currentIndex] = null; // Avoid memory leak
        System.out.println("Category deleted successfully.");
    }

    public void findCategoryByName(Scanner input) {
        System.out.print("Enter category name to find: ");
        String categoryName = input.nextLine();
        int index = findCategoryIndexByName(categoryName);

        if (index == -1) {
            System.out.println("Category not found.");
        } else {
            System.out.println("Category found at index: " + index);
            categories[index].displayData();
        }
    }

    public void chooseUpdate(Scanner input, int index) {
        do {
            System.out.println("\nSelect the field to update:");
            System.out.println("1. Category Name");
            System.out.println("2. Category Priority");
            System.out.println("3. Category Description");
            System.out.println("4. Category Status");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int updateChoice;
            try {
                updateChoice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 5.");
                continue;
            }

            switch (updateChoice) {
                case 1:
                    System.out.print("Enter new category name: ");
                    String newCategoryName = input.nextLine();
                    if (newCategoryName.length() < 6 || newCategoryName.length() > 50) {
                        System.out.println("Category name must be between 6 and 50 characters.");
                    } else if (isUniqueCategoryName(newCategoryName)) {
                        System.out.println("Category name is already in use.");
                    } else {
                        categories[index].setCategoryName(newCategoryName);
                        System.out.println("Category name updated successfully.");
                    }
                    break;
                case 2:
                    System.out.print("Enter new category priority: ");
                    try {
                        categories[index].setCategoryPriority(Integer.parseInt(input.nextLine()));
                        System.out.println("Category priority updated successfully.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter new category description: ");
                    categories[index].setCategoryDescription(input.nextLine());
                    System.out.println("Category description updated successfully.");
                    break;
                case 4:
                    System.out.print("Enter new category status (true/false): ");
                    categories[index].setCategoryStatus(Boolean.parseBoolean(input.nextLine()));
                    System.out.println("Category status updated successfully.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (true);
    }

    public void categoryMenu() {
        System.out.println("\nCategory Management");
        System.out.println("1. View Categories");
        System.out.println("2. Add Category");
        System.out.println("3. Update Category");
        System.out.println("4. Delete Category");
        System.out.println("5. Find Category by Name");
        System.out.println("6. Exit");
    }

    public boolean isEmptyCategory() {
        return currentIndex == 0;
    }
}
