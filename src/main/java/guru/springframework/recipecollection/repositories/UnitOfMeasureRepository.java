package guru.springframework.recipecollection.repositories;

import guru.springframework.recipecollection.domain.Recipe;
import guru.springframework.recipecollection.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author frank
 * @create 2020-12-17
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
