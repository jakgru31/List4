package com.example.list4.Users
import com.example.list4.Product.Product
/**
 * Interface representing purchaseable actions.
 */
interface Purchaseable {
    /**
     * Allows the user to purchase a product.
     *
     * @param product The product to be purchased.
     * @param quantity The quantity of the product to be purchased.
     * @return A message indicating the result of the purchase.
     */
    fun purchase(product: Product, quantity: Int): String

    /**
     * Allows the user to cancel a purchase.
     *
     * @param product The product to be canceled.
     * @return A message indicating the result of the cancellation.
     */
    fun cancel(product: Product): String
}