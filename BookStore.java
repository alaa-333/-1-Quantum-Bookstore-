import java.util.ArrayList;
import java.util.List;

public class BookStore implements BookServices{

    List<Book> booksList = new ArrayList<>();

    public void BookStore ()
    {
    }


    @Override
    public void addBook(Book book) {
        booksList.add(book);
        System.out.println("book added successfully");
    }

    @Override

    public List<Book> removeOldBooks(int maxAge) {
        List<Book> oldBooks = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();

        List<Book> booksCopy = new ArrayList<>(booksList);

        for (Book book : booksCopy) {
            if (currentYear - book.getYear() > maxAge) {
                oldBooks.add(book);
                booksList.remove(book);
            }
        }

        return oldBooks;
    }

    @Override
    public double buyBook(String isbn, int quantity, String email, String address) {



        Book requireBook = null;
        for (Book book : booksList) {
            if (book.getIsbn().equals(isbn)) {
                requireBook = book;
                break;
            }
        }

        if (requireBook == null)
        {
            System.out.println("book with isbn " + isbn + " not found");
        }

        double totalPrice = requireBook.getPrice() * quantity;

        if (requireBook instanceof OnlineBook)
        {

            System.out.println("This is a online book and cannot be purchased");
        }


        if (requireBook instanceof PaperBook)
        {
            PaperBook paperBook = (PaperBook) requireBook;
            if (paperBook.getStock() < quantity)
            {
                System.out.println("not enough stock availlable");
            }
            paperBook.decreaseStock(quantity);
            System.out.println("shipping " + quantity +
                    paperBook.getTitle() +" book "+ " to " + address);
        }
        else if (requireBook instanceof EBook) {
            System.out.println("sending eBook " + requireBook.getTitle() + " to email: " + email);
        }


        return totalPrice;
    }


}
