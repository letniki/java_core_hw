import task1.Book;
import task1.Magazine;
import task1.Printable;
import task2.Drum;
import task2.Guitar;
import task2.Instrument;
import task2.Trumpet;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

             ArrayList<Printable> bookList = new ArrayList<>();
             bookList.add(new Book("Harry Potter", 309, "Joanne Rowling"));
             bookList.add(new Book("Murder on the Orient Express", 256, "Agatha Christie"));
             bookList.add(new Magazine("Scientific American", 150));
             bookList.add(new Magazine("National Geographic", 170));
             bookList.add(new Book("1984", 328, "George Orwell"));

             for (Printable book : bookList) {
                 book.print();
             }

             ArrayList<Instrument> instruments= new ArrayList<>();
             instruments.add(new Trumpet(8.5));
             instruments.add(new Drum(12));
             instruments.add(new Guitar(6));
             for (Instrument instrument : instruments) {
                 instrument.play();
             }
    }
}