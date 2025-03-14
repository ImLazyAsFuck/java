import java.util.Scanner;

public class TestBook{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Book book = new Book();

        System.out.printf("Tiêu đề: ");
        book.setTitle(input.nextLine());
        System.out.printf("Tác giả: ");
        book.setAuthor(input.nextLine());
        System.out.printf("Giấ: ");
        book.setPrice(Double.parseDouble(input.nextLine()));

        System.out.printf("Tiêu đề: %s\n", book.getTitle());
        System.out.printf("Tác giả: %s\n", book.getAuthor());
        System.out.printf("Giá: %.2f\n", book.getPrice());
    }
}