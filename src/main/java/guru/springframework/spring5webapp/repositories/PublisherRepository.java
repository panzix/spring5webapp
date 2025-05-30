package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @InterfaceName PublisherRepository
 * @Description TODO
 * @Author Oneby
 * @Date 2025/5/30 10:31
 * @Version 1.0
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
