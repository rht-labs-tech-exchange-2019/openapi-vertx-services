package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class UpdatePetWithFormRequestBody {

  private String name;
  private String status;

  public UpdatePetWithFormRequestBody (
    String name,
    String status
  ) {
    this.name = name;
    this.status = status;
  }

  public UpdatePetWithFormRequestBody(JsonObject json) {
    UpdatePetWithFormRequestBodyConverter.fromJson(json, this);
  }

  public UpdatePetWithFormRequestBody(UpdatePetWithFormRequestBody other) {
    this.name = other.getName();
    this.status = other.getStatus();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    UpdatePetWithFormRequestBodyConverter.toJson(this, json);
    return json;
  }

  @Fluent public UpdatePetWithFormRequestBody setName(String name){
    this.name = name;
    return this;
  }
  public String getName() {
    return this.name;
  }

  @Fluent public UpdatePetWithFormRequestBody setStatus(String status){
    this.status = status;
    return this;
  }
  public String getStatus() {
    return this.status;
  }

}