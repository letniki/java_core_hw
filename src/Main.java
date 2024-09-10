import task1.Company;
import task1.Geo;
import task1.User;
import task2.Ultrabook;
import task2.Workstation;
import task3.Comic;
import task3.Magazine;
import task4.Car;
import task4.Gender;
import task4.Person;
import task4.Skill;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");
        Geo geo = new Geo(-37.3159, 81.1496);
        User user = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", "1-770-736-8031 x56442", "hildegard.org", company, "Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", geo);
        System.out.println(user);

        System.out.println("Computers:");
        Ultrabook ultrabook = new Ultrabook("Dell", "Intel i7", 16, 512, 12, 1.2);
        Workstation workstation = new Workstation("HP", "Intel Xeon", 32, 1024, 8, "NVIDIA RTX 3080");
        System.out.println(ultrabook);
        System.out.println(workstation);
        System.out.println("Books: ");
        Comic comic = new Comic("Batman", "Bob Kane", 1939, "Action", true);
        Magazine magazine = new Magazine("Forbes", "Steve Forbes", 2024, "Business", "Forbes Media");
        System.out.println(comic);
        System.out.println(magazine);

        System.out.println("Person:");
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 10));
        skills.add(new Skill("c++", 10));
        Car car = new Car("toyota", 2021, 250);
        Person person = new Person(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.Male, skills, car);
        System.out.println(person);
    }
}