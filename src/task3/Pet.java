package task3;

import java.util.Objects;

public class Pet {
    private String name;
    private Animal animal;
    private int id;
    public Pet(String name, Animal animal, int id) {
        this.name = name;
        this.animal = animal;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public Animal getAnimal() {
        return animal;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "{" + animal + ": " + name + '}';
    }
}
