package com.example.list4.Users
/**
 * Abstract class representing a user in the system.
 *
 * @property userID The unique identifier for the user.
 * @property username The username of the user.
 */
abstract class User(val userID: Int, val username: String): Purchaseable {
    /**
     * Returns the role of the user.
     *
     * @return The role of the user as a string.
     */
    abstract fun getUserRole(): String
}