package task3;

public class Papirus {
    private int year;

    public Papirus(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "year: " + year;
    }
}
