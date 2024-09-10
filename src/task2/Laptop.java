package task2;

public class Laptop extends PC{
    private int batteryLife;
    public Laptop(String brand, String processor, int ram, int storage,int batteryLife){
        super(brand, processor, ram, storage);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    @Override
    public String toString() {
        return super.toString() + ", batteryLife: " + batteryLife + " hours";
    }
}
