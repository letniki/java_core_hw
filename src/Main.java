import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Dog labrador = new Dog("Bobby", 3 , "Labrador Retriever");
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        dogList.add(labrador);
        dogList.add(new Dog("Bella", 7, "Rottweiler"));
        dogList.add(new Dog("Daisy", 2, "Poodle"));
        dogList.add(new Dog("Milo", 1, "Toy Terrier"));
        dogList.add(new Dog("Tyler", 6, "French Bulldog"));

        System.out.println("Dogs: ");
        for(Object o : dogList){
            System.out.println(o);
        }

        Car [] cars = new Car[5];
        cars[0]=new Car("Ford", 450, 3.0, false);
        cars[1]=new Car("BMW", 503, 3.0, false);
        cars[2]=new Car("Audi", 261,  2.0, true);
        cars[3]=new Car("Subaru", 310,  2.5, true);
        cars[4]=new Car("Honda", 315, 2, false);
        System.out.println("Cars: ");
        for (Car car : cars){
            System.out.println(car);
        }

        Book[] books = new Book[5];
        ArrayList<String> firstBookauthors = new ArrayList<String>();
        ArrayList<String> secondBookauthors = new ArrayList<String>();
        ArrayList<String> thirdBookauthors = new ArrayList<String>();
        ArrayList<String> fourthBookauthors = new ArrayList<String>();
        ArrayList<String> fifthBookauthors = new ArrayList<String>();
        firstBookauthors.add("George Orwell");
        secondBookauthors.add("Dan Brown");
        thirdBookauthors.add("Joanne Kathleen Rowling");
        fourthBookauthors.add("John Ronald Reuel Tolkin");
        fifthBookauthors.add("Agatha Christie");
        books[0] = new Book("1984", 328, "Dystopian",firstBookauthors);
        books[1] = new Book("The Da Vinci Code", 454, "Thriller", secondBookauthors);
        books[2]=new Book("Harry Potter and the Sorcerer's Stone", 309,  "Fantasy", thirdBookauthors);
        books[3]=new Book("The Hobbit", 310,  "Fantasy", fourthBookauthors);
        books[4]=new Book("Murder on the Orient Express", 256, "Detective", fifthBookauthors);
        System.out.println("Books: ");
        for (Book book : books){
            System.out.println(book);
        }

        Post [] posts = new Post[5];
        posts[0] = new Post (1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit suscipit recusandae consequuntur expedita et cum reprehenderit molestiae ut ut quas totam nostrum rerum est autem sunt rem eveniet architecto");
        posts[1] = new Post (1, 2, "qui est esse", "est rerum tempore vitae sequi sint nihil reprehenderit dolor beatae ea dolores neque fugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis qui aperiam non debitis possimus qui neque nisi nulla");
        posts[2] = new Post (1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure voluptatem occaecati omnis eligendi aut ad voluptatem doloribus vel accusantium quis pariatur molestiae porro eius odio et labore et velit aut");
        posts[3] = new Post (1, 4, "eum et est occaecati", "ullam et saepe reiciendis voluptatem adipisci sit amet autem assumenda provident rerum culpa quis hic commodi nesciunt rem tenetur doloremque ipsam iure quis sunt voluptatem rerum illo velit");
        posts[4] = new Post (1, 5, "nesciunt quas odio", "repudiandae veniam quaerat sunt sed alias aut fugiat sit autem sed est voluptatem omnis possimus esse voluptatibus quis est aut tenetur dolor neque");
        System.out.println("Posts: ");
        for (Post post : posts){
            System.out.println(post);
        }
        Comment[] comments= new Comment[5];
        comments[0] = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos tempora quo necessitatibus dolor quam autem quasi reiciendis et nam sapiente accusantium");
        comments[1]= new Comment(1,2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam et omnis occaecati quod ullam at voluptatem error expedita pariatur nihil sint nostrum voluptatem reiciendis et");
        comments[2]= new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur aut expedita occaecati aliquam eveniet laudantium omnis quibusdam delectus saepe quia accusamus maiores nam est cum et ducimus et vero voluptates excepturi deleniti ratione");
        comments[3] = new Comment(1, 4, "alias odio sit", "Lew@alysha.tv", "non et atque occaecati deserunt quas accusantium unde odit nobis qui voluptatem quia voluptas consequuntur itaque dolor et qui rerum deleniti ut occaecati");
        comments[4] = new Comment(1, 5, "vero eaque aliquid doloribus et culpa", "Hayden@althea.biz", "harum non quasi et ratione tempore iure ex voluptates in ratione harum architecto fugit inventore cupiditate voluptates magni quo et");
        System.out.println("Comments: ");
        for (Comment comment : comments){
            System.out.println(comment);
        }
    }
}