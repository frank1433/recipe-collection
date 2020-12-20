package guru.springframework.recipecollection.service.impl;

import guru.springframework.recipecollection.domain.Recipe;
import guru.springframework.recipecollection.repositories.RecipeRepository;
import guru.springframework.recipecollection.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author frank
 * @create 2020-12-17
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    @Resource
    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes=new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
