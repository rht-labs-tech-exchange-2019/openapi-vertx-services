package com.redhat.labs.petstore.services.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.api.*;

import java.util.List;
import java.util.Map;

import com.redhat.labs.petstore.models.*;
import com.redhat.labs.petstore.services.StoreService;

public class StoreServiceImpl implements StoreService {

  private Vertx vertx;

  public StoreServiceImpl(Vertx vertx) {
    this.vertx = vertx;
  }

  @Override
  public void placeOrder(
    Order body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void getOrderById(
    Long orderId,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void deleteOrder(
    Long orderId,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

}
