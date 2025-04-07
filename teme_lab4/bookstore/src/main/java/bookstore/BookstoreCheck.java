package bookstore;

import java.util.List;
import java.util.stream.Collectors;

public class BookstoreCheck {
    public boolean isDuplicate(Book book, List<Book> books) {
        List<String> bookTitles = books.stream().map(b -> b.getTitle()).collect(Collectors.toList());
        int bookCount = 0;
        bookCount = (int) bookTitles.stream().filter(t -> t.equals(book.getTitle())).count();
        return bookCount > 0;
    }

    public Book thickerBook(Book book1, Book book2) {
        return book1.getPageCount() > book2.getPageCount() ? book1 : book2;
    }
}
