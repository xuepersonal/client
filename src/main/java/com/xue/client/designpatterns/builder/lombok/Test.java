package com.xue.client.designpatterns.builder.lombok;

import com.alibaba.fastjson.JSON;

/**
 * @author QSNP253
 * @title: Test
 * @description: test lombok builder
 * @date 2021/7/1310:22
 */
public class Test {

    @org.junit.Test
    public void test(){
        Result<Object> result = Result.builder()
                .code(ReturnMsg.SUCC_CODE)
                .msg(ReturnMsg.SUCCESS)
                .build();
        String resultJson = JSON.toJSON(result).toString();
        System.out.println(resultJson);
    }
}
