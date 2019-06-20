package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class Pet {

  private Long id;
  private Category category;
  private String name;
  private List<String> photoUrls;
  private List<Tag> tags;
  private String status;

  public Pet (
    Long id,
    Category category,
    String name,
    List<String> photoUrls,
    List<Tag> tags,
    String status
  ) {
    this.id = id;
    this.category = category;
    this.name = name;
    this.photoUrls = photoUrls;
    this.tags = tags;
    this.status = status;
  }

  public Pet(JsonObject json) {
    PetConverter.fromJson(json, this);
  }

  public Pet(Pet other) {
    this.id = other.getId();
    this.category = other.getCategory();
    this.name = other.getName();
    this.photoUrls = other.getPhotoUrls();
    this.tags = other.getTags();
    this.status = other.getStatus();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    PetConverter.toJson(this, json);
    return json;
  }

  @Fluent public Pet setId(Long id){
    this.id = id;
    return this;
  }
  public Long getId() {
    return this.id;
  }

  @Fluent public Pet setCategory(Category category){
    this.category = category;
    return this;
  }
  public Category getCategory() {
    return this.category;
  }

  @Fluent public Pet setName(String name){
    this.name = name;
    return this;
  }
  public String getName() {
    return this.name;
  }

  @Fluent public Pet setPhotoUrls(List<String> photoUrls){
    this.photoUrls = photoUrls;
    return this;
  }
  public List<String> getPhotoUrls() {
    return this.photoUrls;
  }

  @Fluent public Pet setTags(List<Tag> tags){
    this.tags = tags;
    return this;
  }
  public List<Tag> getTags() {
    return this.tags;
  }

  @Fluent public Pet setStatus(String status){
    this.status = status;
    return this;
  }
  public String getStatus() {
    return this.status;
  }

}