package com.xue.client.designpatterns.decorator.IOExpand;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    /**
     * 文件输出大写转小写
     */
    public void test() {
        int c ;
        try(InputStream is = new IODecorator(new BufferedInputStream(new FileInputStream("test.txt")))){
            while ((c = is.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
