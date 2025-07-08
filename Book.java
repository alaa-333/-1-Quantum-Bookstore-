public abstract class Book {
    protected String title;
    protected double price;
    protected int year;

    protected String isbn;


    public Book (String isbn, String title, int year, double price)
    {

        this.price = price;
        this.title = title;
        this.year = year;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
