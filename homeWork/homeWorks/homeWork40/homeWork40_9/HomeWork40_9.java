package homeWorks.homeWork40.homeWork40_9;

import homeWorks.homeWork8.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork40_9 {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>();
        books.add(new Book("name1","author1", Arrays.asList("tag1","tag2")));
        books.add(new Book("name2","author1", Arrays.asList("tag3","tag2")));
        books.add(new Book("name3","author2", Arrays.asList("tag4","tag2")));
        books.add(new Book("name4","author2", Arrays.asList("tag1","tag5")));
        books.add(new Book("name5","author3", Arrays.asList("tag6","tag2")));
        List<String> tags=books.stream().flatMap(book -> book.getTags().stream())
                .distinct().toList();
        System.out.println(tags);
    }
    static class Book{
        String name;
        String author;
        List<String> tags;

        public Book(String name, String author, List<String> tags) {
            this.name = name;
            this.author = author;
            this.tags = tags;
        }

        public List<String> getTags() {
            return tags;
        }
    }
}
