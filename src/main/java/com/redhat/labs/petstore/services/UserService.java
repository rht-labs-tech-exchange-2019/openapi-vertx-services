package com.redhat.labs.petstore.services;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.api.*;
import io.vertx.ext.web.api.generator.WebApiServiceGen;

import java.util.List;
import java.util.Map;

import com.redhat.labs.petstore.models.*;
import com.redhat.labs.petstore.services.impl.UserServiceImpl;

@WebApiServiceGen
public interface UserService {

  static UserService create(Vertx vertx) {
    return new UserServiceImpl(vertx);
  }

  void createUser(
    User body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void createUsersWithArrayInput(
    List<User> body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void createUsersWithListInput(
    List<User> body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void loginUser(
    String username,
    String password,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void logoutUser(
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void getUserByName(
    String username,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void updateUser(
    String username,
    User body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void deleteUser(
    String username,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

}
