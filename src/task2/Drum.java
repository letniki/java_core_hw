package task2;

public class Drum implements Instrument{
    private int size;
    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum size: " + size ;
    }

    @Override
    public void play() {
        System.out.println("Playing a drum with size: "+ size);
    }
}
