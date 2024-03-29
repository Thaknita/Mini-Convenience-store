package com.springboot.minimartapi.product;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cateId;
    private String cateName;

 // @OneToMany (mappedBy = "categories")
  //  List<Product> products;

}
