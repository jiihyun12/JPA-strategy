package com.app.strategy.domain;

// 실습 Product와 상속관계 맺기
// 컬럼: 글쓴이 author, 발행자 pulisher
// 구분컬럼 B
// 생성 후 데이터 INSERT
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table(name = "TBL_BOOK")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("B")
@PrimaryKeyJoinColumn(name = "BOOK_ID")
public class Book extends Product{
    private String bookAuthor;
    private String bookPublisher;
}
