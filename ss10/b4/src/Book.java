public class Book{
    private String title;
    private String author;
    private double price;

    public Book(){
    }

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if(title.isEmpty()){
            System.out.println("Tiêu đề không được trống");
        }
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        if(author.isEmpty()){
            System.out.println("Tên tác giả không được để trống");
            return;
        }
        this.author = author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price <= 0){
            System.out.println("Giá phải lớn hơn 0");
        }
        this.price = price;
    }
}
