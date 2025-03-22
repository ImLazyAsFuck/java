package bussiness;

import entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManagement{
    public static List<Book> books = new ArrayList<Book>();

    public BookManagement(){
    }

    public static List<Book> getBooks(){
        return books;
    }

    public static void addBook(Book book){
        books.add(book);
    }

    public static void removeBook(Book book){
        books.remove(book);
    }

    public boolean isBookIdExisted(String bookId){
        for(Book book : books){
            if(book.getBookId().equals(bookId)){
                return true;
            }
        }
        return false;
    }
}
