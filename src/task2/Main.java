package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();

        users.add(new User(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.Male,
                Arrays.asList(new Skill("java", 10), new Skill("python", 15)),
               new Car("toyota", 2021, 250)));

        users.add(new User(2, "Anna", "Smith", "anna.smith@example.com", 29, Gender.Female,
                Arrays.asList(new Skill("python", 8), new Skill("js", 7)),
                new Car ("honda", 2020, 200)));

        users.add(new User(3, "John", "Doe", "john.doe@example.com", 35, Gender.Male,
                List.of(
                        new Skill("C#", 12)),
                new Car("Ford", 2019, 300)));

         users.add(new User(4 , "Maria", "Garcia", "maria.garcia@example.com", 26, Gender.Female,
                Arrays.asList(new Skill("ruby", 5), new Skill("php", 8)),
        new Car("BMW", 2022, 320)));

        users.add(new User(5, "Alex", "Johnson", "alex.johnson@example.com", 40, Gender.Male,
                Arrays.asList(new Skill("php", 10), new Skill("python", 7)),
                        new Car("Audi", 2021, 280)));

        users.add(new User(6, "Olivia", "Brown", "olivia.brown@example.com", 23, Gender.Female,
                List.of(new Skill("js", 3)),
                new Car("Subaru", 2017, 210)));

        users.add(new User(7, "Sophia", "Miller", "sophia.miller@example.com", 30, Gender.Female,
                Arrays.asList(new Skill("C#", 4), new Skill("python", 8)),
                new Car("Mercedes", 2019, 350)));

        users.add(new User(8, "Michael", "Wilson", "michael.wilson@example.com", 45, Gender.Male,
                Arrays.asList(new Skill("c++", 12), new Skill("java", 10) ),
                new Car("Land Rover", 2021, 320)));

        users.add(new User(9, "Benjamin", "Harris", "benjamin.harris@example.com", 37, Gender.Male,
                Arrays.asList(new Skill("js", 5),new Skill("python", 4)),
                new Car("Nissan", 2022, 200)));

        users.add(new User(10, "James", "Anderson", "james.anderson@example.com", 25, Gender.Male,
                Arrays.asList(new Skill("java", 3),new Skill("js", 4)),
                new Car("Volkswagen", 2018, 210)));

        System.out.println("HashSet:");
        System.out.println(users);
        users.removeIf(user->user.getGender() == Gender.Male);
        users.forEach(user -> System.out.println(user));
        System.out.println(users);

        TreeSet<User> users1 = new TreeSet<>();
        users1.add(new User(1, "Michael", "Wilson", "michael.wilson@example.com", 45, Gender.Male,
                Arrays.asList(new Skill("C++", 12),
                        new Skill("java", 10),
                        new Skill("js", 15)),
                new Car("Land Rover", 2021, 320)));

       users1.add(new User(2, "Sophia", "Miller", "sophia.miller@example.com", 30, Gender.Female,
               Arrays.asList(
                       new Skill("C#", 4),
                       new Skill("python", 8),
                       new Skill("js", 10),
                       new Skill("Ruby", 10)),
               new Car("Mercedes", 2019, 350)));

        users1.add(new User(3, "James", "Anderson", "james.anderson@example.com", 25, Gender.Male,
                Arrays.asList(
                        new Skill("java", 3),
                        new Skill("js", 4)),
                new Car("Volkswagen", 2018, 210)));

        users1.add(new User(4, "Olivia", "Brown", "olivia.brown@example.com", 23, Gender.Female,
                List.of(new Skill("js", 3)),
                new Car("Subaru", 2017, 210)));

        users1.add(new User(5, "Maria", "Garcia", "maria.garcia@example.com", 26, Gender.Female,
                Arrays.asList(
                        new Skill("ruby", 5),
                        new Skill("php", 8),
                        new Skill("python", 7),
                        new Skill("java", 9),
                        new Skill("js", 9),
                        new Skill("C++", 9)),
                new Car("BMW", 2022, 320)));

        users1.add(new User(6, "Anna", "Smith", "anna.smith@example.com", 29, Gender.Female,
                Arrays.asList(
                        new Skill("python", 8),
                        new Skill("js", 7),
                        new Skill("php", 9),
                        new Skill("rust", 10),
                        new Skill("C++", 11)),
                new Car ("honda", 2020, 200)));

        users1.add(new User(7, "John", "Doe", "john.doe@example.com", 35, Gender.Male,
                List.of(new Skill("C#", 12)),
                new Car("Ford", 2019, 300)));

        users1.add(new User( 8, "Isabella", "Martinez", "isabella.martinez@example.com", 30, Gender.Female,
                Arrays.asList(
                        new Skill("C++", 4),
                        new Skill("C", 5),
                        new Skill("Ruby", 6),
                        new Skill("Golang", 3),
                        new Skill("pascal", 8),
                        new Skill("java", 3),
                        new Skill("js", 6)),

       new Car("Hyundai", 2020, 230)));
        users1.add(new User(9, "Benjamin", "Harris", "benjamin.harris@example.com", 37, Gender.Male,
                Arrays.asList(
                        new Skill("js", 5),
                        new Skill("python", 4)),
                new Car("Nissan", 2022, 200)));
        users1.add(new User(10, "Alex", "Johnson", "alex.johnson@example.com", 40, Gender.Male,
                Arrays.asList(
                        new Skill("php", 10),
                        new Skill("python", 7),
                        new Skill("java", 10)),
                new Car("Audi", 2021, 280)));
        System.out.println("TreeSet: ");
        System.out.println(users1);

        users1.forEach(System.out::println);
    }
}
