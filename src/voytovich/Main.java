package voytovich;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        authors.add("authors1");
        authors.add("authors2");
        authors.add("authors3");

        for (int i = 0; i <= 5; i++) {
            Book book = new Book();
            book.setTitle("book" + i);
            book.setYears(1990 + i);
            if (i == 5) {
                ArrayList<String> authors1 = new ArrayList<>();
                authors1.add("author4");
                book.setAuthors(authors1);
            } else if (i == 4) {
                ArrayList<String> authors2 = new ArrayList<>();
                authors2.add("author5");
                authors2.add("author6");
                authors2.add("author7");
                authors2.add("author8");
                book.setAuthors(authors2);
            } else {
                book.setAuthors(authors);
            }

            books.add(book);
        }

        getOldBook(books);
        System.out.println();
        getBookByAuthor("author4", books);
        System.out.println();
        getBookLessYears(1992, books);
        System.out.println();
        getBookByQuantityAuthors(3, books);
    }

    private static void getOldBook(ArrayList<Book> books) {
        ArrayList<Integer> years = new ArrayList<>();
        for (Book book : books) {
            years.add(book.getYears());
        }

        for (Book book : books) {
            if (Collections.min(years) == book.getYears()) {
                System.out.println(
                        book.getTitle() + book.getAuthors().toString()
                );
            }
        }
    }

    private static void getBookByAuthor(String author, ArrayList<Book> books) {
        for (Book book : books) {
            for (String authorName : book.getAuthors()) {
                if (author.equals(authorName)) {
                    System.out.println(
                            book.getTitle() + book.getAuthors().toString()
                    );
                }
            }
        }
    }

    private static void getBookLessYears(int year, ArrayList<Book> books) {
        for (Book book : books) {
            if (book.getYears() < year) {
                System.out.println(
                        book.getTitle() + " " + book.getYears() + book.getAuthors().toString()
                );
            }
        }
    }

    private static void getBookByQuantityAuthors(int quantity, ArrayList<Book> books) {
        for (Book book : books) {
            if (book.getAuthors().size() > quantity) {
                System.out.println(
                        book.getTitle() + " " + book.getYears() + book.getAuthors().toString()
                );
            }
        }
    }
}
