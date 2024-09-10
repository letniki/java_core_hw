package task3;

public class Book extends Papirus{
    private String genre;
    private String title;
    private String author;
    public Book(String title, String author, int year, String genre) {
        super(year);
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "title: " + title + ", author: " + author + ", genre: " + genre + ", " + super.toString();
    }
}
