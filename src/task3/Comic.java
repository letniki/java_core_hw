package task3;

public class Comic extends Book{
    private boolean isColor;

    public Comic(String title, String author, int year, String genre, boolean isColor) {
        super(title, author, year, genre);
        this.isColor = isColor;
    }
    public boolean isColor() {
        return isColor;
    }

    public void setIsColor(boolean isColored) {
        isColor = isColored;
    }
    @Override
    public String toString() {
        return super.toString() + ", colored: " + (isColor ? "yes": "no");
    }
}
