package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class Order {

  private Long id;
  private Long petId;
  private Integer quantity;
  private String shipDate;
  private String status;
  private Boolean complete;

  public Order (
    Long id,
    Long petId,
    Integer quantity,
    String shipDate,
    String status,
    Boolean complete
  ) {
    this.id = id;
    this.petId = petId;
    this.quantity = quantity;
    this.shipDate = shipDate;
    this.status = status;
    this.complete = complete;
  }

  public Order(JsonObject json) {
    OrderConverter.fromJson(json, this);
  }

  public Order(Order other) {
    this.id = other.getId();
    this.petId = other.getPetId();
    this.quantity = other.getQuantity();
    this.shipDate = other.getShipDate();
    this.status = other.getStatus();
    this.complete = other.isComplete();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    OrderConverter.toJson(this, json);
    return json;
  }

  @Fluent public Order setId(Long id){
    this.id = id;
    return this;
  }
  public Long getId() {
    return this.id;
  }

  @Fluent public Order setPetId(Long petId){
    this.petId = petId;
    return this;
  }
  public Long getPetId() {
    return this.petId;
  }

  @Fluent public Order setQuantity(Integer quantity){
    this.quantity = quantity;
    return this;
  }
  public Integer getQuantity() {
    return this.quantity;
  }

  @Fluent public Order setShipDate(String shipDate){
    this.shipDate = shipDate;
    return this;
  }
  public String getShipDate() {
    return this.shipDate;
  }

  @Fluent public Order setStatus(String status){
    this.status = status;
    return this;
  }
  public String getStatus() {
    return this.status;
  }

  @Fluent public Order setComplete(Boolean complete){
    this.complete = complete;
    return this;
  }
  public Boolean isComplete() {
    return this.complete;
  }

}