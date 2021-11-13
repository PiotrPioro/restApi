package pl.coderslab.restapi.service;

import org.springframework.stereotype.Service;
import pl.coderslab.restapi.entity.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InMemoryBookService implements BookService {

    private final List<Book> list;

    public InMemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }

    @Override
    public List<Book> getBooks() {
        return list;
    }

    @Override
    public Book addBook(Book book){
        return book;
    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public Book getBookById(Long id){
        List<Book> book = list.stream()
                .filter(b -> b.getId() == id)
                .collect(Collectors.toList());
        return book.get(0);
    }

    @Override
    public void deleteBook(Long id){
        List<Book> book = list.stream()
                .filter(b -> b.getId() == id)
                .collect(Collectors.toList());
        list.remove(book.get(0));
    }
}
