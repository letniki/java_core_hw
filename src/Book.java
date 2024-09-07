import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;
    private ArrayList<String> authors;
    private String genre;


    public Book(String title, int pages, String genre, ArrayList<String> authors) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String toString(){

        return title + ", "  + pages + " p., " + " Genre: " + genre + ", " +" Authors: " + authors;
    }
}
