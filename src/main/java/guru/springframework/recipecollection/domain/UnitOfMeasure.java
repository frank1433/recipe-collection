package guru.springframework.recipecollection.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author frank
 * @create 2020-12-17
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

}
