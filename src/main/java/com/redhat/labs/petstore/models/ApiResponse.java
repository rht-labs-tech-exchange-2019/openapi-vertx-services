package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class ApiResponse {

  private Integer code;
  private String type;
  private String message;

  public ApiResponse (
    Integer code,
    String type,
    String message
  ) {
    this.code = code;
    this.type = type;
    this.message = message;
  }

  public ApiResponse(JsonObject json) {
    ApiResponseConverter.fromJson(json, this);
  }

  public ApiResponse(ApiResponse other) {
    this.code = other.getCode();
    this.type = other.getType();
    this.message = other.getMessage();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    ApiResponseConverter.toJson(this, json);
    return json;
  }

  @Fluent public ApiResponse setCode(Integer code){
    this.code = code;
    return this;
  }
  public Integer getCode() {
    return this.code;
  }

  @Fluent public ApiResponse setType(String type){
    this.type = type;
    return this;
  }
  public String getType() {
    return this.type;
  }

  @Fluent public ApiResponse setMessage(String message){
    this.message = message;
    return this;
  }
  public String getMessage() {
    return this.message;
  }

}