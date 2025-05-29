package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author panzi
 * @create 29/05/2025 - 3:51 PM
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
