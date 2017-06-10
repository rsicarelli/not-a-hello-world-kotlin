package com.notahelloworld.kotlin.nullable;

public class JavaUserRepository {

  public String getUserName(int userId) {
    User user = new UserDAO().getUser(userId);
    return user.name; //NPE!!!
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

