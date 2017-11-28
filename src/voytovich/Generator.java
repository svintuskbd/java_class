package voytovich;

import java.util.ArrayList;

public final class Generator {
    private Generator() {
    }

    public static ArrayList<Book> generate() {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        authors.add("authors1");
        authors.add("authors2");
        authors.add("authors3");

        for (int i = 0; i <= 5; i++) {
            if (i == 5) {
                ArrayList<String> authors1 = new ArrayList<>();
                authors1.add("author4");
                Book book = new Book("book" + i,authors1, 1990 + i);
                books.add(book);
            } else if (i == 4) {
                ArrayList<String> authors2 = new ArrayList<>();
                authors2.add("author5");
                authors2.add("author6");
                authors2.add("author7");
                authors2.add("author8");
                Book book = new Book("book" + i,authors2, 1990 + i);
                books.add(book);
            } else {
                Book book = new Book("book" + i,authors, 1990 + i);
                books.add(book);
            }
        }

        return books;
    }
}
