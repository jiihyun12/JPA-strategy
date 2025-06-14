package com.app.strategy.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Commit
@Transactional(rollbackFor = Exception.class)
class EntityTests {

    @PersistenceContext
    EntityManager entityManager;

    @Test
    public void saveTest(){
        Clothes clothes = new Clothes();

        clothes.setName("옷");
        clothes.setPrice(200_000);
        clothes.setClothesSize(100);
        clothes.setClothColor("red");

        entityManager.persist(clothes);
    }
}