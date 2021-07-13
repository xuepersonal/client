package com.xue.client.example;

import org.junit.Test;

import java.util.StringJoiner;

/**
 * @author QSNP253
 */
public class StringJionerExampleTest {

    @Test
    public void test(){
        StringJoiner sj = new StringJoiner(":", "[", "]");
        sj.add("George").add("Sally").add("Fred");
        String desiredString = sj.toString();
        System.out.println(desiredString);
        /*
        [George:Sally:Fred]
         */
    }
}
