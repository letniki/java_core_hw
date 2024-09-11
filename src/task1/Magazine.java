package task1;

public class Magazine implements Printable{
    private String title;
    private int pages;
    public Magazine(String title, int pages) {
        this.title = title;
        this.pages = pages;
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
        return "title= " + title + ", pages= " + pages;
    }

    @Override
    public void print() {
        System.out.println("Magazine Title: " + title + ", Pages: " + pages);
    }
}
