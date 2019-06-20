package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class Category {

  private Long id;
  private String name;

  public Category (
    Long id,
    String name
  ) {
    this.id = id;
    this.name = name;
  }

  public Category(JsonObject json) {
    CategoryConverter.fromJson(json, this);
  }

  public Category(Category other) {
    this.id = other.getId();
    this.name = other.getName();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    CategoryConverter.toJson(this, json);
    return json;
  }

  @Fluent public Category setId(Long id){
    this.id = id;
    return this;
  }
  public Long getId() {
    return this.id;
  }

  @Fluent public Category setName(String name){
    this.name = name;
    return this;
  }
  public String getName() {
    return this.name;
  }

}