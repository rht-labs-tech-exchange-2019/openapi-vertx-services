package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class Tag {

  private Long id;
  private String name;

  public Tag (
    Long id,
    String name
  ) {
    this.id = id;
    this.name = name;
  }

  public Tag(JsonObject json) {
    TagConverter.fromJson(json, this);
  }

  public Tag(Tag other) {
    this.id = other.getId();
    this.name = other.getName();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    TagConverter.toJson(this, json);
    return json;
  }

  @Fluent public Tag setId(Long id){
    this.id = id;
    return this;
  }
  public Long getId() {
    return this.id;
  }

  @Fluent public Tag setName(String name){
    this.name = name;
    return this;
  }
  public String getName() {
    return this.name;
  }

}