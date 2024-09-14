package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Oleksandr", 27),
                new User("Sofia", 36),
                new User("Dmitry", 41),
                new User("Michael", 23),
                new User("Victoria", 25),
                new User("Anna", 24),
                new User("Elena", 24));

        System.out.println(users);
        users.sort((o1,o2) -> o1.getAge() - o2.getAge());
        System.out.println("Users sorted by ascending age: " + users);
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println("Users sorted by descending age: " + users);
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println("Users sorted by ascending name: " + users);
        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println("Users sorted by descending name: " + users);


        ArrayList<String> strings = new ArrayList<>();
        strings.add("chair");
        strings.add("apple");
        strings.add("tree");
        strings.add("mountain");
        strings.add("garden");
        strings.add("window");
        strings.add("star");
        strings.add("cloud");
        strings.add("ocean");
        strings.add("burger");
        System.out.println(strings );
        strings.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println("Sorted from A to Z: " + strings);
        strings.sort(String::compareTo);
        System.out.println("Sorted from A to Z: " + strings);
        strings.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println("Sorted from Z to A: " + strings);
        strings.sort(Comparator.reverseOrder());
        System.out.println("Sorted from Z to A: " + strings);
    }
}