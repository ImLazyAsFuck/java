import java.util.List;

public class LibraryManagement{
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("B001", "Java Programming", "James Gosling", 1995));
        library.addBook(new Book("B002", "Effective Java", "Joshua Bloch", 2008));
        library.addBook(new Book("B003", "Clean Code", "Robert C. Martin", 2008));
        library.addBook(new Book("B004", "The Pragmatic Programmer", "Andrew Hunt", 1999));
        library.addBook(new Book("B005", "Design Patterns", "Erich Gamma", 1994));

        List<Book> filteredBooks = library.filterBooksAfterYear(1999);
        library.sortBooksByTitle(filteredBooks);

        System.out.println("Books published after 1999 (sorted by title):");
        library.printBooks(filteredBooks);
    }
}