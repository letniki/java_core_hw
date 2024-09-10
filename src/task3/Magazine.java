package task3;

public class Magazine extends Book {
    private String publisher;

    public Magazine(String title, String author, int year, String genre, String publisher) {
        super(title, author, year, genre);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return super.toString() + ", publisher: " + publisher;
    }
}
