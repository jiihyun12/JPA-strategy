package com.app.strategy.domain;

import com.app.strategy.domain.base.Period;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Commit @Transactional
class EntityTests {

    @PersistenceContext
    EntityManager entityManager;

    @Test
    public void saveTest() {
        Clothes clothes = new Clothes();

        clothes.setName("옷");
        clothes.setPrice(200_000);
        clothes.setClothesSize(100);
        clothes.setClothesColor("red");
        entityManager.persist(clothes);

        Book book = new Book();
        book.setName("김동건 자서전");
        book.setPrice(10);
        book.setBookAuthor("홍길동");
        book.setBookPublisher("코리아");
        entityManager.persist(book);

    }

    //    조회 (등가 조인)
    @Test
    public void bookFindTests(){
        entityManager.find(Book.class, 2L);
    }

    //    상속 받은 테이블까지 모두 삭제
    @Test
    public void bookDeleteTests() {
        Book book = entityManager.find(Book.class, 2L);
        entityManager.remove(book);
    }





}







