package com.ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.server.RouterFunctions;

@Configuration
public class GatewayConfig {
    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions
            .route()
            .GET("/api/route1", serverRequest ->
                ServerResponse.ok()
                    .contentType(MediaType.TEXT_PLAIN)
                    .body(BodyInserters.fromValue("This is Route 1"))
            )
            .GET("/api/route2", serverRequest ->
                ServerResponse.ok()
                    .contentType(MediaType.TEXT_PLAIN)
                    .body(BodyInserters.fromValue("This is Route 2"))
            )
            .onError(IllegalArgumentException.class, (ex, request) ->
                ServerResponse.status(HttpStatus.BAD_REQUEST)
                    .contentType(MediaType.TEXT_PLAIN)
                    .body(BodyInserters.fromValue("Bad Request"))
            )
            .build();
    }
}

