package voytovich;

import static voytovich.Generator.generate;

public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(generate());
        System.out.println(bookShelf.getBooksByAuthor("author1"));
        System.out.println();

        System.out.println(bookShelf.getBooksByQuantityAuthors(2));
        System.out.println();

        System.out.println(bookShelf.getBooksLessYears(1993));
        System.out.println();

        System.out.println(bookShelf.getOldestBook());

    }
}
