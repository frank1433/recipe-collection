package guru.springframework.recipecollection.repositories;

import guru.springframework.recipecollection.domain.Recipe;
import guru.springframework.recipecollection.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author frank
 * @create 2020-12-17
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
