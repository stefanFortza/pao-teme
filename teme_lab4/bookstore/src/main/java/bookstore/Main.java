package bookstore;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceți nr de carți: ");
        int bookCount = sc.nextInt();
        BookstoreTest bookstoreTest = new BookstoreTest();

        for (int i = 0; i < bookCount; i++) {
            System.out.println("Introduceti detaliile cartii " + (i + 1) + ": ");
            System.out.print("Titlu: ");
            String title = sc.next();
            System.out.print("Autor: ");
            String author = sc.next();
            System.out.print("Editură: ");
            String publisher = sc.next();
            System.out.print("Număr de pagini: ");
            int pageCount = sc.nextInt();

            if (pageCount < 0) {
                System.out.println("Numărul de pagini nu poate fi negativ.");
                i--;
                continue;
            }

            Book book = new Book(title, author, publisher, pageCount);
            bookstoreTest.createBook(book);
        }

        sc.close();

        for (Book book : bookstoreTest.readBooks()) {
            System.out.println(book);
        }

        BookstoreCheck bookstoreCheck = new BookstoreCheck();

        List<Book> books = bookstoreTest.readBooks();

        boolean isDuplicate = bookstoreCheck.isDuplicate(books.get(0), books);
        System.out.println(isDuplicate);
        System.out.println("Cartea mai groasa: " + bookstoreCheck.thickerBook(books.get(0), books.get(1)));
    }
}