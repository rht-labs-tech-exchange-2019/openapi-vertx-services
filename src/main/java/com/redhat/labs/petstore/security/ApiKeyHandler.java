package com.redhat.labs.petstore.security;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

public class ApiKeyHandler implements Handler<RoutingContext> {

    public ApiKeyHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        // Handle api_key security schema
        routingContext.next();
    }

}