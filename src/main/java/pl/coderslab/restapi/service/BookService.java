package pl.coderslab.restapi.service;

import pl.coderslab.restapi.entity.Book;

import java.util.List;

public interface BookService {

    Book getBookById(Long id);

    Book addBook(Book book);

    void updateBook(Book book);

    void deleteBook(Long id);

    List<Book> getBooks();
}
