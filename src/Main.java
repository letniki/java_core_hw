import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        System.out.println(readFromFile("emails.txt"));
//        writeToFile("emails.txt", )
//        Path path = Paths.get(System.getProperty("user.home"));
//        Stream<Path> stream = Files.list(path);
//        stream.forEach(file -> System.out.println(file.getFileName()));
//        Files.readAllLines("email.txt");
        String string = readFromFile("emails.txt");

        List<String> collect = Arrays.stream(string.split("\\s+")).filter(email -> email.contains("@gmail.com")).toList();
        writeToFile("gmail_emails.txt", String.join("\n", collect));
        String string1 = readFromFile("gmail_emails.txt");
        System.out.println(string1);
    }
@SneakyThrows
    public static void writeToFile(String fileName, String text){
    Path FilePath = Paths.get(fileName);
    Files.writeString(FilePath, text, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
@SneakyThrows
public static String readFromFile(String fileName) {
    Path filePath = Paths.get(fileName);
    return Files.readString(filePath);
    }
}