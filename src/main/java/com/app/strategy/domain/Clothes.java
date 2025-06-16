package com.app.strategy.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "TBL_CLOTHES")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("C")
@PrimaryKeyJoinColumn(name = "CLOTHES_ID") // PK - FK
public class Clothes extends Product{

    private Integer clothesSize;
    private String clothesColor;
}
