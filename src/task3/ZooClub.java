package task3;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public ZooClub() {}
    public ZooClub(Map <Person, List<Pet>> club) {
    this.club = club;
}

    private Person getPersonById(int personId) {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            if (entry.getKey().getId() == personId) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void addPerson(String name) {
        int id = 1;
        for (Person person : club.keySet()) {
            if (person.getId() >= id) {
                id = person.getId() + 1;
            }
        }
        club.put(new Person( name, id), new ArrayList<>());
    }

    public void showAll() {
        if (club.isEmpty()) {
            System.out.println("Club is empty");
        }
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            Person person = entry.getKey();
            List<Pet> pets = entry.getValue();

            System.out.println(person + " Pets: " + pets);
        }

    }

    public void addPet(int personId, Animal animal, String  name) {
        if (!club.isEmpty()) {
            Person person = getPersonById(personId);

            if (person != null) {
                int petId = 1;
                List<Pet> pets = club.get(person);
                for (Pet pet : pets) {
                    if (pet.getId() >= petId) {
                        petId = pet.getId() + 1;
                    }
                }
                pets.add(new Pet(name, animal, petId));
                System.out.println(person + " Pets: " + pets);
            } else {
                System.out.println("Person with this ID not found");
            }
        }
    }

    public void deletePetById(int personId, int petId) {
        if (!club.isEmpty()) {
            Person person = getPersonById(personId);
            if (person != null) {
                List<Pet> pets = club.get(person);

                System.out.println("Pets of " + person.getName() + ":");
                for (Pet pet : pets) {
                    System.out.println( pet.getId() + ". " + pet);
                }
                pets.removeIf(pet -> pet.getId() == petId);
            } else {
                System.out.println("Person not found");
            }
        }
    }
    public void deletePetByName(int personId, String petName) {
        if (!club.isEmpty()) {
            Person person = getPersonById(personId);
            if (person != null) {
                List<Pet> pets = club.get(person);
                System.out.println("Pets of " + person.getName() + ":");
                for (Pet pet : pets) {
                    System.out.println(pet.getId() + ". " + pet);
                }
                pets.removeIf(pet -> pet.getName().equals(petName));
            } else {
                System.out.println("Person not found");
            }
        }
    }

    public void deletePerson(int id) {
        if (!club.isEmpty()) {
            Person person = getPersonById(id);

            if (person != null) {
                club.remove(person);
            } else {
                System.out.println("Person not found");
            }
        }
    }
    public void deleteAnimalByType(Animal animal, String petName) {

        for (List<Pet> pets : club.values()) {
            pets.removeIf(pet -> (pet.getAnimal() == animal && pet.getName().equals(petName)));
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooClub zooClub = (ZooClub) o;
        return Objects.equals(club, zooClub.club);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(club);
    }
}