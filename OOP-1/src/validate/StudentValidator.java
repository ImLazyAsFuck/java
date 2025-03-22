package validate;

import entity.Book;
import entity.ResponseMessage;

import java.util.Scanner;

public class StudentValidator{
    public static String BookIdValidator(Scanner input, ResponseMessage message){
        while(true){
            System.out.print(message.getMessage());
            String bookId = input.nextLine();
            for(Book book: ){
                if(book.getBookId().equals(bookId)){
                    System.out.println(message.getError());
                    continue;
                }
            }
            return bookId;
        }
    }
}
