package com.app.strategy.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "TBL_CLOTHES")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("C")
@PrimaryKeyJoinColumn(name = "CLOTHES_ID") // FK 이자 PK
public class Clothes extends Product {

    private Integer clothesSize;
    private String clothColor;

}
