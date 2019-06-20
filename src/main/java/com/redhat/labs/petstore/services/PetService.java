package com.redhat.labs.petstore.services;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.api.*;
import io.vertx.ext.web.api.generator.WebApiServiceGen;

import java.util.List;
import java.util.Map;

import com.redhat.labs.petstore.models.*;
import com.redhat.labs.petstore.services.impl.PetServiceImpl;

@WebApiServiceGen
public interface PetService {

  static PetService create(Vertx vertx) {
    return new PetServiceImpl(vertx);
  }

  void updatePet(
    Pet body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void addPet(
    Pet body,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void findPetsByStatus(
    List<String> status,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void findPetsByTags(
    List<String> tags,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void getPetById(
    Long petId,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void updatePetWithForm(
    Long petId,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void deletePet(
    Long petId,
    String apiKey,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void uploadFile(
    Long petId,
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

  void getInventory(
    OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

}
