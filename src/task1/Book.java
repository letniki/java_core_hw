package task1;

public class Book implements Printable {
    private String title;
    private String author;
    private int pages;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Pages: " + pages + ", Author: " + author;
    }

    @Override
    public void print() {
        System.out.println(title +" written by " + author + ", Pages: " + pages);
    }
}
