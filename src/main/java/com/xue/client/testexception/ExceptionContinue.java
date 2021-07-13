package com.xue.client.testexception;


import com.xue.client.testexception.exception.OrdException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author QSNP253
 */
public class ExceptionContinue {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionContinue.class);

    @Test
    public void test(){

        logger.info("process begins...");

        try{
            logger.info("process run...");
            throw new OrdException("throw exception");
        } catch(OrdException e){
            logger.info("process error...");
            e.printStackTrace();
        }
        logger.info("process end...");
    }
}
