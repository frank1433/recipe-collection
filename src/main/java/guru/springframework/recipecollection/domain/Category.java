package guru.springframework.recipecollection.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author frank
 * @create 2020-12-17
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "category")
    private Set<Recipe> recipe;

    public Category() {
    }

}
