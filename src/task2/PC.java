package task2;

public class PC {
    private String brand;
    private String processor;
    private int ram;
    private int storage;
    public PC(String brand, String processor, int ram, int storage) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public String getProcessor() {
        return processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "brand: " + brand +
                ", processor: " + processor +
                ", ram: " + ram + " GB"+
                ", storage: " + storage + " GB";
    }
}
