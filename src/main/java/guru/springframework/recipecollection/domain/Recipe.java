package guru.springframework.recipecollection.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author frank
 */

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients =new HashSet<>();
    @Lob
    private Byte[] image;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;
    @ManyToMany
    @JoinTable(name = "recipe_category", joinColumns = @JoinColumn(columnDefinition = "recipe_id"), inverseJoinColumns = @JoinColumn(columnDefinition = "category_id"))
    private Set<Category> category=new HashSet<>();

    public Recipe() {
    }


    public Recipe addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }

    public void setCategories(Set<Category> categories) {
        this.category = categories;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Recipe;
    }

}
