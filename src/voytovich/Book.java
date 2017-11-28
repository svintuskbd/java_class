package voytovich;

import java.util.List;

public class Book {
    private String title;
    private List<String> authors;
    private int years;

    public Book(String title, List<String> authors, int years) {
        this.title = title;
        this.authors = authors;
        this.years = years;
    }

    public boolean isOlderThen(Book book) {
        return years < book.getYears();
    }

    public int getYears() {
        return years;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }
}
