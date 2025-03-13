import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int currentIndex = 0;
        Book[] books = new Book[100];
        do{
            Method.menu();
            System.out.printf("Mời bạn chọn: ");
            choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1:
                    Method.displayBook(currentIndex, books);
                    break;
                case 2:
                    currentIndex = Method.insertBooks(input, currentIndex, books);
                    break;
                case 3:
                    Method.calculateAndDisplayProfit(currentIndex, books);
                    break;
                case 4:
                    Method.updateBooks(input, currentIndex, books);
                    break;
                case 5:
                    Method.deleteBook(input, currentIndex, books);
                    break;
                case 6:
                    Method.sortBookByProfit(currentIndex, books);
                    break;
                case 7:
                    Method.searchBookByAuthor(input, currentIndex, books);
                    break;
                case 8:
                    Method.statisticsByAuthor(currentIndex, books);
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 - 10");
            }
        }while(true);
    }
}
