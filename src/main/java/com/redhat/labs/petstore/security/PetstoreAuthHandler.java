package com.redhat.labs.petstore.security;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

public class PetstoreAuthHandler implements Handler<RoutingContext> {

    public PetstoreAuthHandler(){

    }

    @Override
    public void handle(RoutingContext routingContext) {
        // Handle  security schema
        routingContext.next();
    }

}