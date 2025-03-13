import java.util.Scanner;

public class Book{
    private String bookId;
    private String bookName;
    private double importPrice;
    private double exportPrice;
    private String title;
    private String author;
    private double interest;
    private int year;

    public Book(){
    }

    public Book(String bookId, double importPrice, String bookName, double exportPrice, String title, String author, double interest, int year){
        this.bookId = bookId;
        this.importPrice = importPrice;
        this.bookName = bookName;
        this.exportPrice = exportPrice;
        this.title = title;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId(){
        return bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public double getImportPrice(){
        return importPrice;
    }

    public double getExportPrice(){
        return exportPrice;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getInterest(){
        return interest;
    }

    public int getYear(){
        return year;
    }

    public void setBookId(String bookId){
        this.bookId = bookId;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public void setImportPrice(double importPrice){
        this.importPrice = importPrice;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setExportPrice(double exportPrice){
        this.exportPrice = exportPrice;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setInterest(double interest){
        this.interest = interest;
    }

    public void inputData(Scanner input){

        do{
            System.out.printf("ID: ");
            String newBookId = input.nextLine();
            if(newBookId.matches("^B\\d{4}$")){
                this.setBookId(newBookId);
                break;
            }
            System.out.println("Mã không hợp lệ. Vui lòng nhập mã bắt đầu bằng B và dài 5 ký tự");
        }while(true);

        do{
            System.out.printf("Tên sách: ");
            String newBookName = input.nextLine();
            if(newBookName.length() < 6){
                System.out.println("Độ dài của tên sách phải trên 6");
            }else if(newBookName.length() > 100){
                System.out.println("Độ dài của tên sách không được vượt quá 100");
            }else{
                this.setBookName(newBookName);
                break;
            }
        }while(true);

        double newImportPrice;
        double newExportPrice;

        do{
            System.out.printf("Giá nhập: ");
            newImportPrice = Double.parseDouble(input.nextLine());
            if(newImportPrice < 0){
                System.out.println("Giá nhập không hợp lệ");
            }else{
                this.setImportPrice(newImportPrice);
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
            this.setExportPrice(newExportPrice);
            break;
        }while(true);

        do{
            System.out.printf("Tiêu đề: ");
            String newTitle = input.nextLine();
            if(newTitle.isEmpty()){
                System.out.println("Tiêu đề không được để trống");
                continue;
            }
            this.setTitle(newTitle);
            break;
        }while(true);

        do{
            System.out.printf("Tên tác giả: ");
            String newAuthor = input.nextLine();
            if(newAuthor.isEmpty()){
                System.out.println("Tên tác giả không được để trống");
                continue;
            }
            this.setAuthor(newAuthor);
            break;
        }while(true);

        this.callInterest();

        do{
            System.out.printf("Năm: ");
            int newYear = Integer.parseInt(input.nextLine());
            if(newYear < 1970){
                System.out.println("Năm phải lớn hơn 1970");
                continue;
            }
            this.setYear(newYear);
            break;
        }while(true);

    }

    public void displayData(){
        System.out.printf("ID: %s\n", this.getBookId());
        System.out.printf("Tên sách: %s\n", this,getBookName());
        System.out.printf("Giá nhập: %.2f\n", this,getImportPrice());
        System.out.printf("Giá xuất: %.2f\n", this,getExportPrice());
        System.out.printf("Tiêu đề: %s\n", this,getTitle());
        System.out.printf("Tên tác giả: %s\n", this,getAuthor());
        System.out.printf("Lợi nhuận: %d\n", this,getInterest());
        System.out.printf("Năm: %d\n", this,getYear());
    }

    public double callInterest(){
        this.interest = this.getExportPrice() - this.getImportPrice();
        return this.getInterest();
    }
}
