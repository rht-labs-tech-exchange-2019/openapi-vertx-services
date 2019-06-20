package com.redhat.labs.petstore.services;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.api.*;
import io.vertx.ext.web.api.generator.WebApiServiceGen;

import java.util.List;
import java.util.Map;

import com.redhat.labs.petstore.models.*;
import com.redhat.labs.petstore.services.impl.StoreServiceImpl;

@WebApiServiceGen
public interface StoreService {

  static StoreService create(Vertx vertx) {
    return new StoreServiceImpl(vertx);
  }

  void placeOrder(
    Order body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void getOrderById(
    Long orderId,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void deleteOrder(
    Long orderId,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

}
