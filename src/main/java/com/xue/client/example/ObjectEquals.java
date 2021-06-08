package com.xue.client.example;

import org.junit.Test;

import java.util.Objects;

public class ObjectEquals {

    @Test
    public void Test(){
        /*
        字符串比较
         */
        String a = "";
        String b = "";
        String c = null;
        /*if(c.equals(a)){
            System.out.printf("true");
        }*/
        if(Objects.equals(a,b)){
            System.out.printf("a==b:true");
        }
        if(Objects.equals(c,a)){
            System.out.printf("a==c:true");
        }
        if((c==a) || (c!=null && c.equals(a))){
            System.out.printf("a==c:true");
        }
    }
}
