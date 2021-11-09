package pl.coderslab.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.restapi.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
