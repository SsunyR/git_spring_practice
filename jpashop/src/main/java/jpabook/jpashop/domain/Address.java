package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Embeddable // Getting own table of specific information as a attribute -> Value Type
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    public String city;
    public String street;
    public String zipcode;

}
