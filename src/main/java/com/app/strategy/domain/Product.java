package com.app.strategy.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TBL_PRODUCT")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(
        name = "SEQ_PRODUCT_SENERATOR",
        sequenceName = "SEQ_GENERATOR"
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE") // 구분정렬
public class Product {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCT_GENERATOR")
    private Long id;

    private String name;
    private Integer price;
}
