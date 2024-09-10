package task2;

public class Ultrabook extends Laptop {
    private double weight;

    public Ultrabook(String brand, String processor, int ram, int storage, int batteryLife, double weight) {
        super(brand, processor, ram, storage, batteryLife);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + ", weight: " + weight +" kg";
    }
}
