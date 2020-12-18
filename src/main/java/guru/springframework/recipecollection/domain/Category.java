package guru.springframework.recipecollection.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author frank
 * @create 2020-12-17
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "category")
    private Set<Recipe> recipe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipe;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipe = recipes;
    }
}
