package com.example.list4.Users
import com.example.list4.Product.Product
import com.example.list4.Store.ProductStatus
/**
 * Represents a Customer user in the system.
 *
 * @property userID The unique identifier for the user.
 * @property username The username of the user.
 */
class Customer(userID: Int, username: String): User(userID, username) {

    /**
     * Returns the role of the user.
     *
     * @return The role of the user as a string.
     */
    override fun getUserRole(): String {
        return "Customer $username"
    }

    /**
     * Allows the customer to purchase a product.
     *
     * @param product The product to be purchased.
     * @param quantity The quantity of the product to be purchased.
     * @return A message indicating the result of the purchase.
     */
    override fun purchase(product: Product, quantity: Int): String {
        return when (product.status) {
            ProductStatus.OUT_OF_STOCK -> "Product ${product.name} is out of stock"
            ProductStatus.DISCONTINUED -> "Product ${product.name} is discontinued"
            else -> "Customer $username purchased $quantity ${product.name}"
        }
    }

    /**
     * Allows the customer to cancel a purchase.
     *
     * @param product The product to be canceled.
     * @return A message indicating the result of the cancellation.
     */
    override fun cancel(product: Product): String {
        return "Customer $username canceled order of ${product.name}"
    }
}