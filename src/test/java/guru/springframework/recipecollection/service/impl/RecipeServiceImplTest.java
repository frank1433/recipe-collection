package guru.springframework.recipecollection.service.impl;

import guru.springframework.recipecollection.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author frank
 * @create 2020-12-19
 */
class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService =new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
    }
}