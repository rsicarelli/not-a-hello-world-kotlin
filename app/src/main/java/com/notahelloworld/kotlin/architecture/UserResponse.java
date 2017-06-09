package com.notahelloworld.kotlin.architecture;

public class UserResponse {

  private String id;
  private String name;
  private String email;
  private String phone;
  private final String status;

  public UserResponse(String id, String name, String email, String phone, String status) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "NewUserResponse: " +
        "\nid: " + id +
        "\nname: " + name +
        "\nemail: " + email +
        "\nphone: " + phone +
        "\nstatus: " + status;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof NewUserResponse && (this.id.equals(((NewUserResponse) obj).getId()));
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    return prime * result + ((id == null) ? 0 : id.hashCode());
  }
}
