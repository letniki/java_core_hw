package task3;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();
        zooClub.addPerson("Dima");
        zooClub.addPerson("Max");
        zooClub.addPerson("Daria");
        zooClub.addPerson("Mary");
        zooClub.addPet(1, Animal.Dog, "Rex");
        zooClub.addPet(1, Animal.Cat, "Whiskers");
        zooClub.addPet(1, Animal.Fish, "Bubbles");
        zooClub.addPet(2, Animal.Parrot, "Tweety");
        zooClub.addPet(2, Animal.Parrot, "Kesha");
        zooClub.addPet(2, Animal.Cat, "Oliver");
        zooClub.addPet(3, Animal.Dog, "Rex");
        zooClub.addPet(3, Animal.Horse, "Bella");
        zooClub.addPet(4, Animal.Dog, "Charlie");
        System.out.println("-----------------------");
        zooClub.showAll();
        System.out.println("-----------------------");

        zooClub.deletePetById(1,2);

        zooClub.deletePetByName(2,"Kesha");

        System.out.println("--------Delete Dog Rex from all owners---------");
        zooClub.deleteAnimalByType(Animal.Dog, "Rex");

        zooClub.deletePerson(4);
        System.out.println("-----------------------");
        zooClub.showAll();

    }
}
