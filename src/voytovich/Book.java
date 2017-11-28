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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (years != book.years) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return authors != null ? authors.equals(book.authors) : book.authors == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + years;
        return result;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", years=" + years +
                '}';
    }
}
