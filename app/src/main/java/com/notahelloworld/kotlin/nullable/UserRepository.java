package com.notahelloworld.kotlin.nullable;

public class UserRepository {

  public String getUserName(int userId) {
    User user = new UserDAO().getUser(userId);
    return user.name;
  }

  class UserDAO {
    User getUser(int userId) {
      //database.query(userId)
      return null;
    }
  }

  class User {
    String name;
  }

}

