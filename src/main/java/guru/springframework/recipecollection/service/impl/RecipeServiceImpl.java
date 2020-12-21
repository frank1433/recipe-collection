package guru.springframework.recipecollection.service.impl;

import guru.springframework.recipecollection.domain.Recipe;
import guru.springframework.recipecollection.repositories.RecipeRepository;
import guru.springframework.recipecollection.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author frank
 * @create 2020-12-17
 */
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

//    private final RecipeRepository recipeRepository;
//    public RecipeServiceImpl(RecipeRepository recipeRepository) {
//        this.recipeRepository = recipeRepository;
//    }
     @Resource
     RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository=recipeRepository;
    }


    @Override
    public Set<Recipe> getRecipes() {
        log.debug("in the service");
        Set<Recipe> recipeSet=new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
    @Override
    public Recipe findById(Long id) {
        Optional<Recipe> recipeOptional=recipeRepository.findById(id);
        if (!recipeOptional.isPresent()){
            throw new RuntimeException("recipe not found");
        }
        return recipeOptional.get();
    }
}
