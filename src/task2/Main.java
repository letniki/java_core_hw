package task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars =Arrays.asList(
        new Car("Honda", 158, new Owner("Natalia", 20,2), 15500, 2018),
        new Car("Toyota", 170, new Owner("Oleksandr", 32, 10), 20000, 2020),
        new Car("Ford", 150, new Owner("Andrey", 35, 8), 16200, 2018),
        new Car("Bmw", 255, new Owner("Oleg", 40, 12), 35000, 2021),
        new Car("Mercedes", 240, new Owner("Dmitry", 45, 3), 30000, 2017),
        new Car("Audi", 190, new Owner("Vlad", 25, 5), 28000, 2020),
        new Car("Volkswagen", 150, new Owner("Maryna", 26, 3), 8000, 2013),
        new Car("Subaru", 180, new Owner("Ivan", 29, 6), 25500, 2020),
        new Car("Kia", 170, new Owner("Anastasia", 29, 1), 10000, 2016),
        new Car("Dodge", 280,new Owner("Mark",24,4), 27500, 2019));

        System.out.println("Cars before repair:");
        cars.forEach(System.out::println);
        cars.stream().limit(cars.size()/2).forEach(car ->car.setPower(car.getPower()+car.getPower()*0.1));
        System.out.println("Cars after repair:");
        cars.forEach(System.out::println);
        cars.stream().filter(car -> car.getOwner().getAge() >25 && car.getOwner().getExperience() < 5).forEach(car -> car.getOwner().setExperience(car.getOwner().getExperience()+1));
        System.out.println("Cars after increasing driving experience:");
        cars.forEach(System.out::println);
        int sum = cars.stream().mapToInt(Car::getPrice).sum();
        System.out.println("Total price: " + sum);
    }
}
