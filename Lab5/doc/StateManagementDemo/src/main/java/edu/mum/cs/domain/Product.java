package edu.mum.cs.domain;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private Long id;

    private String name;

    private Double price;
}
