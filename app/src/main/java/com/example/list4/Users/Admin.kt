package com.example.list4.Users

import com.example.list4.Store.Store
import com.example.list4.Store.ProductStatus
import com.example.list4.Product.Product

/**
 * Represents an Admin user in the system.
 *
 * @property userID The unique identifier for the user.
 * @property username The username of the user.
 */
class Admin(userID: Int, username: String): User(userID, username) {

    /**
     * Returns the role of the user.
     *
     * @return The role of the user as a string.
     */
    override fun getUserRole(): String {
        return "Admin $username"
    }

    /**
     * Admins cannot purchase products.
     *
     * @param product The product to be purchased.
     * @param quantity The quantity of the product to be purchased.
     * @return A message indicating that admins cannot purchase.
     */
    override fun purchase(product: Product, quantity: Int): String {
        return "Admins cannot purchase"
    }

    /**
     * Admins cannot cancel purchases.
     *
     * @param product The product to be canceled.
     * @return A message indicating that admins cannot cancel.
     */
    override fun cancel(product: Product): String {
        return "Admins cannot cancel"
    }

    /**
     * Adds a product to the store.
     *
     * @param store The store to which the product will be added.
     * @param product The product to be added.
     */
    fun addProduct(store: Store, product: Product) {
        store.addProduct(product)
    }

    /**
     * Updates the price of a product.
     *
     * @param product The product whose price will be updated.
     * @param price The new price of the product.
     */
    fun updatePrice(product: Product, price: Double) {
        product.price = price
    }

    /**
     * Updates the status of a product.
     *
     * @param product The product whose status will be updated.
     * @param status The new status of the product.
     */
    fun updateStatus(product: Product, status: ProductStatus) {
        product.status = status
    }

    /**
     * Removes a product from the store.
     *
     * @param store The store from which the product will be removed.
     * @param product The product to be removed.
     */
    fun removeProduct(store: Store, product: Product) {
        store.removeProduct(product.id)
    }
}