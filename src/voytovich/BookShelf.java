package voytovich;

import java.util.ArrayList;

public class BookShelf {
    public ArrayList<Book> books;

    public BookShelf(ArrayList<Book> books) {
        this.books = books;
    }

    public Book getOldestBook() {
        Book book = books.get(0);
        for (int i = 1; i < this.books.size(); i++) {
            if (this.books.get(i).isOlderThen(book)) {
                book = books.get(i);
            }
        }

        return book;
    }

    public ArrayList<Book> getBooksByAuthor(String author) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            for (String authorName : book.getAuthors()) {
                if (author.equals(authorName)) {
                    books.add(book);
                }
            }
        }

        return books;
    }

    public ArrayList<Book> getBooksLessYears(int year) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getYears() < year) {
                books.add(book);
            }
        }

        return books;
    }

    public ArrayList<Book> getBooksByQuantityAuthors(int quantity) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getAuthors().size() > quantity) {
                books.add(book);
            }
        }

        return books;
    }
}
