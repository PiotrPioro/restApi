package pl.coderslab.restapi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.restapi.entity.Book;
import pl.coderslab.restapi.repository.BookRepository;

import java.util.List;

@Service
@Primary
public class JpaBookService implements BookService{

    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.getById(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.delete(bookRepository.getById(id));
    }

    @Override
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
