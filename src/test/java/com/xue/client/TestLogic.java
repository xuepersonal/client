package com.xue.client;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestLogic {

    @Test
    public void test(){
        BigDecimal payamtTotal = new BigDecimal("0");
        BigDecimal aa = new BigDecimal("6.12");
        payamtTotal = payamtTotal.add(aa);
        System.out.println(payamtTotal);
    }
}
