package guru.springframework.recipecollection.service;

import guru.springframework.recipecollection.domain.Recipe;

import java.util.Optional;
import java.util.Set;

/**
 * @author frank
 * @create 2020-12-17
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);
}
