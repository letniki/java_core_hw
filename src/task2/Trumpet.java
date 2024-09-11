package task2;

public class Trumpet implements Instrument{
    private double diameter;
    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return " Trumpet diameter: " + diameter;
    }

    @Override
    public void play() {
        System.out.println("Playing a trumpet with diameter: " + diameter);
    }
}
