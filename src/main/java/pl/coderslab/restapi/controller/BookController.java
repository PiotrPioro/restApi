package pl.coderslab.restapi.controller;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.restapi.entity.Book;
import pl.coderslab.restapi.service.JpaBookService;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final JpaBookService jpaBookService;

    public BookController(JpaBookService jpaBookService) {
        this.jpaBookService = jpaBookService;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return jpaBookService.addBook(book);
    }

    @GetMapping
    public List<Book> bookList(){
        return jpaBookService.getBooks();
    }

    @PutMapping("/{id:\\d+}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        book.setId(id);
        jpaBookService.updateBook(book);
        return book;
    }

    @DeleteMapping("/{id:\\d+}")
    public void deleteBook(@PathVariable Long id){
        jpaBookService.deleteBook(id);
    }

    @GetMapping("/{id:\\d+}")
    public Book getBookById(@PathVariable Long id){
       return jpaBookService.getBookById(id);
    }
}
