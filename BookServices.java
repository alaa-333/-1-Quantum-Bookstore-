import java.util.List;

public interface BookServices {


    void addBook (Book book);
    List<Book> removeOldBooks (int year);
    double buyBook (String isbn , int qtn , String address , String mail);

}
