package com.app.strategy.domain;

import com.app.strategy.domain.base.Period;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_PRODUCT")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@SequenceGenerator(
        name = "SEQ_PRODUCT_GENERATOR",
        sequenceName = "SEQ_PRODUCT"
)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE") // 구분컬럼
public class Product extends Period {
    @Column(name = "PRODUCT_ID")
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCT_GENERATOR")
    private Long id;
    private String name;
    private Integer price;

}
