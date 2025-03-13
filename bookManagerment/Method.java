import java.util.Scanner;

public class Method{
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Danh sách sách");
        System.out.println("2. Thêm mới sách");
        System.out.println("3. Tính lợi nhuận của các sách");
        System.out.println("4. Cập nhật sách");
        System.out.println("5. Xóa sách");
        System.out.println("6. Sắp xếp sách theo lợi nhuận tăng dần");
        System.out.println("7. Tìm kiếm sách theo tác giả");
        System.out.println("8. Tìm kiếm sách theo khoảng giá (tìm theo bảng giá bán)");
        System.out.println("9. Thống kê sách theo mỗi tác giả");
        System.out.println("10. Thoát");
    }

    public static boolean isEmptyBookInBooks(int amount){
        return amount == 0;
    }

    public static void displayBook(int currentIndex, Book[] books){
        if(isEmptyBookInBooks(currentIndex)){
            System.out.println("Danh sách sách trống.");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            System.out.printf("Sách thứ %d\n", i + 1);
            books[i].displayData();
        }
    }

    public static int insertBooks(Scanner input, int currentIndex, Book[] books){
        System.out.printf("Số lượng sách thêm: ");
        int amountBook = Integer.parseInt(input.nextLine());
        if(amountBook <= 0){
            System.out.println("Số lượng sách không hợp lệ");
            return currentIndex;
        }
        if(amountBook + currentIndex > books.length){
            System.out.println("Số lượng sách vượt quá giới hạn");
            return currentIndex;
        }
        for(int i = currentIndex; i < currentIndex + amountBook; i++){
            books[i] = new Book();
            books[i].inputData(input);
        }
        return currentIndex += amountBook;
    }

    public static void calculateAndDisplayProfit(int currentIndex, Book[] books){
        if(isEmptyBookInBooks(currentIndex)){
            System.out.println("Danh sách sách trống");
            return;
        }
        for(int i = 0; i < currentIndex; i++){
            books[i].callInterest();
            System.out.printf("Lợi nhuận của sách %d: %.2f\n", i + 1, books[i].getInterest());
        }
    }

    public static void updateBooks(Scanner input, int currentIndex, Book[] books){
        if(isEmptyBookInBooks(currentIndex)){
            System.out.println("Danh sách sách trống");
            return;
        }
        String id = input.nextLine();
        int foundIndex = -1;
        for(int i = 0; i < currentIndex; i++){
            if(id.equals(books[i].getBookId())){
                foundIndex = i;
            }
        }
        if(foundIndex == -1){
            System.out.printf("Không tìm thấy sách có mã: %s\n", id);
            return;
        }

        subMenu();
        System.out.printf("Mời bạn chọn: ");
        int subChoice = Integer.parseInt(input.nextLine());
        switch(subChoice){
            case 1:
                do{
                    System.out.printf("Tên sách: ");
                    String newBookName = input.nextLine();
                    if(newBookName.length() < 6){
                        System.out.println("Độ dài của tên sách phải trên 6");
                    }else if(newBookName.length() > 100){
                        System.out.println("Độ dài của tên sách không được vượt quá 100");
                    }else{
                        books[foundIndex].setBookName(newBookName);
                        break;
                    }
                }while(true);
                break;
            case 2:
                double newImportPrice;
                double newExportPrice;
                do{
                    System.out.printf("Giá nhập: ");
                    newImportPrice = Double.parseDouble(input.nextLine());
                    if(newImportPrice < 0){
                        System.out.println("Giá nhập không hợp lệ");
                    }else{
                        books[foundIndex].setImportPrice(newImportPrice);
                        break;
                    }
                }while(true);

                do{
                    System.out.printf("Giá xuất: ");
                    newExportPrice = Double.parseDouble(input.nextLine());
                    if(newExportPrice < newImportPrice + (newImportPrice / 10)){
                        System.out.println("Giá xuất không được nhỏ hơn 10% giá nhập hoặc nhỏ hơn 0");
                        continue;
                    }
                    books[foundIndex].setExportPrice(newExportPrice);
                    break;
                }while(true);
                break;
            case 3:
                do{
                    System.out.printf("Tiêu đề: ");
                    String newTitle = input.nextLine();
                    if(newTitle.isEmpty()){
                        System.out.println("Tiêu đề không được để trống");
                        continue;
                    }
                    books[foundIndex].setTitle(newTitle);
                    break;
                }while(true);
                break;
            case 4:
                do{
                    System.out.printf("Tên tác giả: ");
                    String newAuthor = input.nextLine();
                    if(newAuthor.isEmpty()){
                        System.out.println("Tên tác giả không được để trống");
                        continue;
                    }
                    books[foundIndex].setAuthor(newAuthor);
                    break;
                }while(true);
                break;
            case 5:
                do{
                    System.out.printf("Năm: ");
                    int newYear = Integer.parseInt(input.nextLine());
                    if(newYear < 1970){
                        System.out.println("Năm phải lớn hơn 1970");
                        continue;
                    }
                    books[foundIndex].setYear(newYear);
                    break;
                }while(true);
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 - 6");
        }
    }

    public static void subMenu(){
        System.out.println("Menu cập nhật sách");
        System.out.println("1. Tên sách");
        System.out.println("2. Giá nhập và giá xuất");
        System.out.println("3. Tiêu đề");
        System.out.println("4. Tên tác giả");
        System.out.println("5. Năm");
        System.out.println("6. Thoát");
    }

    public static void deleteBook(Scanner input ,int currentIndex, Book[] books){
        System.out.printf("Nhập id của sách muốn xóa: ");
        String id = input.nextLine();
        int found = -1;
        for(int i = 0; i < currentIndex; i++){
            if(id.equals(books[i].getBookId())){
                found = i;
            }
        }
        if(found == -1){
            System.out.println("Không tìm thấy sách");
            return;
        }
        for(int i = found; i < currentIndex; i++){
            books[i] = books[i + 1];
        }
        currentIndex--;
    }

    public static void sortBookByProfit(int currentIndex, Book[] books){
        for(int i = 0; i < currentIndex - 1; i++){
            for(int j = i + 1; j < currentIndex; j++){
                if(books[i].getInterest() > books[j].getInterest()){
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    public static void searchBookByAuthor(Scanner input, int currentIndex, Book[] books){
        System.out.printf("Mời nhập tên tác giả: ");
        String authorName = input.nextLine();
        System.out.printf("Sách của tác giả: %s\n", authorName);
        for(int i = 0; i < currentIndex; i++){
            if(authorName.equals(books[i].getAuthor())){
                books[i].displayData();
            }
        }
    }

    public static void searchBookByPriceRange(Scanner input, int currentIndex, Book[] books){
        System.out.printf("Mời nhập giá thấp: ");
        double minPrice = Double.parseDouble(input.nextLine());
        System.out.printf("Mời nhập giá cao: ");
        double maxPrice = Double.parseDouble(input.nextLine());
        boolean found = false;
        for(int i = 0; i < currentIndex; i++){
            if(books[i].getExportPrice() >= minPrice && books[i].getExportPrice() <= maxPrice){
                books[i].displayData();
                System.out.println();
                found = true;
            }
        }
        if(!found){
            System.out.printf("Không có sách nào trong khoảng giá %.2f đến %.2f\n", minPrice, maxPrice);
        }
    }

    public static void statisticsByAuthor(int currentIndex, Book[] books){
        System.out.println("Thống kê sách theo tác giả: ");
        for(int i = 0; i < currentIndex; i++){
            String authorName = books[i].getAuthor();
            int count = 0;
            boolean isExistedAuthor = false;
            for(int j = 0; j < i; j++){
                if(authorName.equals(books[i].getAuthor())){
                    isExistedAuthor = true;
                    break;
                }
            }
            if(isExistedAuthor){
                continue;
            }
            for(int j = 0; j < i; j++){
                if(authorName.equals(books[i].getAuthor())){
                    count++;
                }
            }
            System.out.printf("Tác giả: %s\nCó: %dsách\n", authorName, count);
        }
    }
}
