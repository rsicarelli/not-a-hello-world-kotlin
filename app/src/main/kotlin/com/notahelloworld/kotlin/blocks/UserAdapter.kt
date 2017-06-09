package com.notahelloworld.kotlin.blocks

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.notahelloworld.kotlin.nullable.UserRepository1

class UserAdapter : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

  val users: List<UserRepository1.User> = arrayListOf()

  override fun onBindViewHolder(holder: UserAdapter.ViewHolder?, position: Int) {
    val user = users[position]

    with(user) {
      holder?.name = name!!
    }
  }

  override fun getItemCount(): Int {
    TODO("not implemented")
  }

  override fun onCreateViewHolder(p0: ViewGroup?, p1: Int): ViewHolder? {
    TODO("not implemented")
  }

  inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var name: String = "John Doe"
  }

}
