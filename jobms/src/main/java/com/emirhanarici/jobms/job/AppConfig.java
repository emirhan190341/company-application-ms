package com.emirhanarici.jobms.job;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {


    @Bean
    @LoadBalanced // "http://localhost:8081/companies/" ==> "http://COMPANY-SERVICE:8081/companies/"
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
