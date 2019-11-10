package com.learnspringboot.app.ws.ui.model.response;

public class UserRest {

  private String userId;
  private String username;
  private String name;

  public UserRest() {
  }

  public UserRest(String userId, String username, String name) {
    this.userId = userId;
    this.username = username;
    this.name = name;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}