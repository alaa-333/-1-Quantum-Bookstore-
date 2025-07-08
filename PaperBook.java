public class PaperBook extends Book {

    private int stock;


    public PaperBook(String isbn, String title, int year, double price, int stock)
    {
        super( isbn,  title,  year,  price);
        this.stock = stock;
    }

    public void decreaseStock(int qtn)
    {
        if (stock < qtn)
        {
            System.out.println("not available");
            return;
        }
        setStock(stock-qtn);
        System.out.println("now stock is : "+getStock());
    }

    public void ship (String address)
    {
        System.out.println(this.getTitle() + " is shipping to " +address);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
