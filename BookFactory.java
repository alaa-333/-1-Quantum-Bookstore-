class BookFactory {


    public static Book createBook(String type,String isbn, String title, int year, double price, String... otherArgs)
    {
        switch(type.toLowerCase())
        {
            case "paper":
                return new PaperBook(isbn, title, year, price, Integer.parseInt(otherArgs[0]));
            case "ebook":
                return new EBook(isbn, title, year, price, otherArgs[0]);
            default:
                return new OnlineBook(isbn, title, year, price);
        }
    }
}