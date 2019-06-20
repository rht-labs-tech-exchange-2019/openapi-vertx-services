package com.redhat.labs.petstore.services.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.api.*;

import java.util.List;
import java.util.Map;

import com.redhat.labs.petstore.models.*;
import com.redhat.labs.petstore.services.UserService;

public class UserServiceImpl implements UserService {

  private Vertx vertx;

  public UserServiceImpl(Vertx vertx) {
    this.vertx = vertx;
  }

  @Override
  public void createUser(
    User body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void createUsersWithArrayInput(
    List<User> body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void createUsersWithListInput(
    List<User> body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void loginUser(
    String username,
    String password,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void logoutUser(
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void getUserByName(
    String username,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void updateUser(
    String username,
    User body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

  @Override
  public void deleteUser(
    String username,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler){
    // Write your business logic here
    resultHandler.handle(Future.succeededFuture(new OperationResponse().setStatusCode(501).setStatusMessage("Not Implemented")));
  }

}
