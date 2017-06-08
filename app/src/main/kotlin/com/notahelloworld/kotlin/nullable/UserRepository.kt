package com.notahelloworld.kotlin.nullable

class UserRepository {

  fun getUserName(userId: Int): String? {
    val user = UserDAO().getUser(userId)
    return user?.name
  }

  internal inner class UserDAO {
    fun getUser(userId: Int): User? {
      //database.query(userId)
      return null
    }
  }

  internal inner class User {
    var name: String? = null
  }

}
