package com.elu.fruitsservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FruitsServiceTwoApplication {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        SpringApplication.run(FruitsServiceTwoApplication.class, args);
    }

}
