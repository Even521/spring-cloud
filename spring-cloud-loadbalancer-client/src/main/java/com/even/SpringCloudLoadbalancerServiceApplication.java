package com.even;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.reactive.ReactiveLoadBalancer;
import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.cloud.client.loadbalancer.reactive.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import static com.even.SpringCloudLoadbalancerServiceApplication.call;

@SpringBootApplication
public class SpringCloudLoadbalancerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudLoadbalancerServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    WebClient.Builder builder() {
        return WebClient.builder();
    }

    @Bean
    WebClient webClient(WebClient.Builder builder) {
        return builder.build();
    }

    static Flux<Greeting> call(WebClient webClient, String url) {
        return webClient.get().uri(url).retrieve().bodyToFlux(Greeting.class);
    }
}


