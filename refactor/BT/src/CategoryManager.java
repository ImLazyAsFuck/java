import java.util.Scanner;

public class CategoryManager{
    private final Category[] categories = new Category[100];
    private int currentIndex = 0;

    public void addCategory(Scanner input){
        if(currentIndex < categories.length){
            Category newCategory = new Category();
            newCategory.inputData(input);
            categories[currentIndex++] = newCategory;
        }else{
            System.out.println("List is full");
        }
    }

    public boolean isUniqueCategoryName(String categoryName){
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(categories[i].getCategoryName().equals(categoryName)){
                found = i;
            }
        }
        return found != -1;
    }

    public void displayCategories(){
        for(Category c: categories){
            c.displayData();
            System.out.println();
        }
    }

    public void updateCategory(Scanner input){
        int found = -1;
        String name = input.nextLine();
        for(int i = 0; i < currentIndex; i++){
            if(name.equals(categories[i].getCategoryName())){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Can't find category with ID");
            return;
        }
        this.chooseUpdate(input, found);
    }


    public void categoryMenu(){
        System.out.println("Category Management");
        System.out.println("1. Category list");
        System.out.println("2. Add category");
        System.out.println("3. Update category");
        System.out.println("4. Delete category");
        System.out.println("5. Find category by name");
        System.out.println("6. Exit");
    }

    public void chooseUpdate(Scanner input, int index){
        do{
            System.out.println("Please enter the category you want to update");
            System.out.println("1. Category Name");
            System.out.println("2. Category Priority");
            System.out.println("3. Category Description");
            System.out.println("4. Category Status");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int updateChoice = Integer.parseInt(input.nextLine());
            switch(updateChoice){
                case 1:
                    System.out.print("Enter category name: ");
                    String newCategoryName = input.nextLine();
                    do{
                        if(newCategoryName.length() < 6 || newCategoryName.length() > 50){
                            System.out.println("Category name must be between 6 and 50 characters");
                        }
                        if(isUniqueCategoryName(newCategoryName)){
                            categories[index].setCategoryName(newCategoryName);
                            break;
                        }else{
                            System.out.println("Category name is already in use");
                        }
                    }while(true);
                    break;
                case 2:
                    System.out.print("Enter category priority: ");
                    categories[index].setCategoryPriority(Integer.parseInt(input.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter category description: ");
                    categories[index].setCategoryDescription(input.nextLine());
                    break;
                case 4:
                    System.out.print("Enter category status: ");
                    boolean newCategoryStatus = Boolean.parseBoolean(input.nextLine());
                    categories[index].setCategoryStatus(newCategoryStatus);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(true);
    }

    public void deleteCategory(Scanner input){
        System.out.print("Enter category new name: ");
        String newCategoryName = input.nextLine();
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(categories[i].getCategoryName().equals(newCategoryName)){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Can't find category with ID");
            return;
        }
        for(int i = found; i < currentIndex; i++){
            categories[i] = categories[i + 1];
        }
        this.currentIndex--;
    }

    public void findCategoryByName(Scanner input){
        int found = -1;
        String categoryName = input.nextLine();
        for(int i = 0; i < currentIndex; i++){
            if(categories[i].getCategoryName().equals(categoryName)){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Can't find category with ID");
        }else{
            System.out.println("Found " + categoryName + " at " + found);
        }
    }

    public boolean isEmptyCategory(){
        return currentIndex == 0;
    }
}
