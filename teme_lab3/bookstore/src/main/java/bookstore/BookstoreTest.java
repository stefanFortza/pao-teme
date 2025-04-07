package bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookstoreTest {
    private List<Book> books = new ArrayList<>();

    public void createBook(Book book) {
        books.add(book);
    }

    public List<Book> readBooks() {
        return books;
    }

    public void updateBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() == book.getTitle()) {
                books.set(i, book);
            }
        }
    }

    public void deleteBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle() == book.getTitle()) {
                books.remove(i);
            }
        }
    }
}
