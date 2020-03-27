package com.even;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Map;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@SpringBootApplication
public class SpringCloudLoadbalancerServiceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudLoadbalancerServiceApiApplication.class, args);
    }

    @Bean
    RouterFunction<ServerResponse> routes() {
        return route()
                .GET("/greetings", r -> ServerResponse.ok().bodyValue(Map.of("greetings", "Hello, Word!")))
                .build();
    }

}
