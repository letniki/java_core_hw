package task2;

public class Car {
    private String model;
    private double power;
    private Owner owner;
    private int price;
    private int year;
    public Car(String model, double power, Owner owner, int price, int year) {
        this.model = model;
        this.power = power;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{model: " + model +
                ", power: " + power +
                ", owner: " + owner +
                ", price: " + price +
                ", year:" + year + '}';
    }
}
