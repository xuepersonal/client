package com.xue.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author QSNP253
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);

    }

    /*public static void main(String args[]){
        ConfigurableApplicationContext context =
                SpringApplication.run(ApplicationConfig.class);
        TargetService targetService = context.getBean(TargetService.class);
        targetService.doSomething();
        context.close();
    }*/

}
