package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("sun");
        strings.add("book");
        strings.add("bird");
        strings.add("sea");
        strings.add("city");
        strings.add("river");
        strings.add("tree");
        strings.add("star");
        strings.add("flower");
        strings.add("apple");
        strings.add("moon");
        strings.add("bridge");
        strings.add("park");
        strings.add("street");
        strings.add("ocean");
        strings.add("lake");
        List<String> list = strings.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(list);
        List<String> list1 = strings.stream().filter(o -> o.length() < 4).toList();
        System.out.println(list1);

        List<Integer> integers = Arrays.asList(1, 250, 3, 14, 5, 6, 73, 8, 9, 10, 45, 15, 90, -30, 28, 19,-2, 1, -42, 9);
        List<Integer> sortedIntegers = integers.stream().sorted().toList();
        System.out.println(sortedIntegers);
        System.out.println(integers.stream().sorted().distinct().toList());

        List<Integer> list2 = integers.stream().filter(integer -> integer % 3 == 0).toList();
        System.out.println(list2);

        List<Integer> integerList = integers.stream().filter(integer -> integer % 10 == 0).toList();
        System.out.println(integerList);

        integers.stream().forEach(System.out::println);
        List<Integer> integerList1 = integers.stream().map(integer -> integer * 3).toList();
        System.out.println(integerList1);
    }
}