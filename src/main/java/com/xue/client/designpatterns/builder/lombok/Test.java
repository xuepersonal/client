package com.xue.client.designpatterns.builder.lombok;

/**
 * @author QSNP253
 * @title: Test
 * @description: test lombok builder
 * @date 2021/7/1310:22
 */
public class Test {

    @org.junit.Test
    public void test(){
        Result result = Result.builder()
                .code(ReturnMsg.SUCC_CODE)
                .msg(ReturnMsg.SUCCESS)
                .build();
    }
}
