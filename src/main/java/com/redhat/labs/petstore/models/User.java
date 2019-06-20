package com.redhat.labs.petstore.models;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.json.JsonObject;
import java.util.List;
import java.util.Map;

@DataObject(generateConverter = true, publicConverter = false)
public class User {

  private Long id;
  private String username;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String phone;
  private Integer userStatus;

  public User (
    Long id,
    String username,
    String firstName,
    String lastName,
    String email,
    String password,
    String phone,
    Integer userStatus
  ) {
    this.id = id;
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.phone = phone;
    this.userStatus = userStatus;
  }

  public User(JsonObject json) {
    UserConverter.fromJson(json, this);
  }

  public User(User other) {
    this.id = other.getId();
    this.username = other.getUsername();
    this.firstName = other.getFirstName();
    this.lastName = other.getLastName();
    this.email = other.getEmail();
    this.password = other.getPassword();
    this.phone = other.getPhone();
    this.userStatus = other.getUserStatus();
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    UserConverter.toJson(this, json);
    return json;
  }

  @Fluent public User setId(Long id){
    this.id = id;
    return this;
  }
  public Long getId() {
    return this.id;
  }

  @Fluent public User setUsername(String username){
    this.username = username;
    return this;
  }
  public String getUsername() {
    return this.username;
  }

  @Fluent public User setFirstName(String firstName){
    this.firstName = firstName;
    return this;
  }
  public String getFirstName() {
    return this.firstName;
  }

  @Fluent public User setLastName(String lastName){
    this.lastName = lastName;
    return this;
  }
  public String getLastName() {
    return this.lastName;
  }

  @Fluent public User setEmail(String email){
    this.email = email;
    return this;
  }
  public String getEmail() {
    return this.email;
  }

  @Fluent public User setPassword(String password){
    this.password = password;
    return this;
  }
  public String getPassword() {
    return this.password;
  }

  @Fluent public User setPhone(String phone){
    this.phone = phone;
    return this;
  }
  public String getPhone() {
    return this.phone;
  }

  @Fluent public User setUserStatus(Integer userStatus){
    this.userStatus = userStatus;
    return this;
  }
  public Integer getUserStatus() {
    return this.userStatus;
  }

}