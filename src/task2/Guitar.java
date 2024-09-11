package task2;

public class Guitar implements Instrument{
    private int strings;
    public Guitar(int strings) {
        this.strings = strings;
    }
    public int getStrings() {
        return strings;
    }
    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "Guitar with " + strings + "strings";
    }

    @Override
    public void play() {
        System.out.println("Playing a guitar with " + strings + " strings");
    }
}
