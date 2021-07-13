package com.xue.client.config;

import com.xue.client.entity.ValueBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author QSNP253
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public ValueBean valueBean(){

        ValueBean valueBean = new ValueBean();
        valueBean.setValue1("1");
        return valueBean;
    }

}
