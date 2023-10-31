package jpabook.jpashop.domain.item;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("B") // Value for column made by superclass' @DiscriminatorColumn. This case, ("dtype")
@Getter @Setter
public class Book extends Item{

    private String author;
    private String isbn;
}
