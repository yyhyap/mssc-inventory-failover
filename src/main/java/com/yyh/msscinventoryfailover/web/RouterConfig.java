package com.yyh.msscinventoryfailover.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class RouterConfig {

    @Bean
    // request mapping to get, and accept APPLICATION_JSON
    public RouterFunction inventoryRoute(InventoryHandler inventoryHandler){
        // request mapping to get, and accept APPLICATION_JSON
        return route(GET("/inventory-failover-webflux").and(accept(MediaType.APPLICATION_JSON)),
                // when we get a request for this, will be handled by inventoryHandler listInventory
                inventoryHandler::listInventory);
    }
}
