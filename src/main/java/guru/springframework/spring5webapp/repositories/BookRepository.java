package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author panzi
 * @create 29/05/2025 - 3:54 PM
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
