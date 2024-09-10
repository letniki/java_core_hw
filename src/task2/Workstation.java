package task2;

public class Workstation extends Laptop{
    private String gpu;

    public Workstation(String brand, String processor, int ram, int storage,int batteryLife, String gpu) {
        super(brand, processor, ram, storage, batteryLife);
        this.gpu = gpu;
    }
    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return super.toString() + ", gpu: " + gpu;
    }
}
