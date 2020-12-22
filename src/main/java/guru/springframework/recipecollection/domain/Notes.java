package guru.springframework.recipecollection.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author frank
 * @create 2020-12-17
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

//    public Notes() {
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof Notes;
//    }

}
