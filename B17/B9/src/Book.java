import java.util.Objects;

public class Book{
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id, String title, String author, int year){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book)obj;
        return id.equals(book.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return "Book{id='" + id + "', title='" + title + "', author='" + author + "', year=" + year + "}";
    }
}
