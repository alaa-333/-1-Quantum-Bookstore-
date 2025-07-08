public class EBook extends Book{

    private String fileType;


    public EBook(String isbn, String title, int year, double price, String fileType)
    {
        super( isbn,  title,  year,  price);
        this.fileType = fileType;
    }

    public void sendTroughMail (String email)
    {
        System.out.println(this.getTitle() + " is sended into "+email);
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
