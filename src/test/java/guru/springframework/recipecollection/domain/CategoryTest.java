package guru.springframework.recipecollection.domain;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author frank
 * @create 2020-12-19
 */
class CategoryTest {

    Category category;

    @BeforeEach
    void setUp() {
        category=new Category();
    }
    @Test
    void getId() throws Exception{
        Long idValue =4L;
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipe() {
    }
}