package com.mami.spel.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpElTest {

    @Autowired
    private SpElBeanA spElBeanA;

    @Test
    public void whenSpElBeanAIsInjected_thenExpressionResolvedCorrectly() {

        assertNotNull(spElBeanA);
    }

}