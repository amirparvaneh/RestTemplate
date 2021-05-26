package com.resttemplate.resttemplate;

import com.resttemplate.resttemplate.service.CardServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ResttemplateApplication {

    @Bean
    public RestTemplate getResttemplate(){
        return new RestTemplate();
    }
    @Bean
    public CardServiceImp gert(){
        return new CardServiceImp();
    }

    public static void main(String[] args) {
        SpringApplication.run(ResttemplateApplication.class, args);
    }

}
