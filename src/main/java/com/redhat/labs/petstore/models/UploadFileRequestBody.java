package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class UploadFileRequestBody {

  private String additionalMetadata;
  private String file;

  public UploadFileRequestBody (
    String additionalMetadata,
    String file
  ) {
    this.additionalMetadata = additionalMetadata;
    this.file = file;
  }

  public UploadFileRequestBody(JsonObject json) {
    UploadFileRequestBodyConverter.fromJson(json, this);
  }

  public UploadFileRequestBody(UploadFileRequestBody other) {
    this.additionalMetadata = other.getAdditionalMetadata();
    this.file = other.getFile();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    UploadFileRequestBodyConverter.toJson(this, json);
    return json;
  }

  @Fluent public UploadFileRequestBody setAdditionalMetadata(String additionalMetadata){
    this.additionalMetadata = additionalMetadata;
    return this;
  }
  public String getAdditionalMetadata() {
    return this.additionalMetadata;
  }

  @Fluent public UploadFileRequestBody setFile(String file){
    this.file = file;
    return this;
  }
  public String getFile() {
    return this.file;
  }

}