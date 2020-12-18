package guru.springframework.recipecollection.repositories;

import guru.springframework.recipecollection.domain.Category;
import guru.springframework.recipecollection.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author frank
 * @create 2020-12-17
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
