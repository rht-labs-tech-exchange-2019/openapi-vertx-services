package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class GetInventory200Response {


  public GetInventory200Response (
  ) {
  }

  public GetInventory200Response(JsonObject json) {
    GetInventory200ResponseConverter.fromJson(json, this);
  }

  public GetInventory200Response(GetInventory200Response other) {
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    GetInventory200ResponseConverter.toJson(this, json);
    return json;
  }

}