package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable // Getting own table of specific information as a attribute -> Value Type
@Getter
public class Address {

    public String city;
    public String street;
    public String zipcode;
}
