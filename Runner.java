import java.util.List;

public class Runner {

    public static void main(String[] args) {
        BookStore store = new BookStore();

        store.addBook( BookFactory.createBook("paper","002","java",2023 , 20.00 , String.valueOf(20)));

        store.addBook(BookFactory.createBook("ebook","004","html",2020 , 5.00 , "pdf"));
        store.addBook(BookFactory.createBook("onlinebook","003","css",2020 , 5.00 ));



        double total = store.buyBook("004", 2, "", "123 main Street");
            System.out.println("total: $" + total);

            total = store.buyBook("002", 1, "alaamo@gmail.com", "mansoura");
            System.out.println("total: $" + total);

            store.buyBook("003", 1, "", "");


        List<Book> oldBooks = store.removeOldBooks(3);
        System.out.println("Removed " + oldBooks.size() + " books");
    }
}
