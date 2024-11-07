package com.example.list4.Users

abstract class User(val userID: Int, val username: String): Purchaseable {
    abstract fun getUserRole(): String
}