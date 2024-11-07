package com.example.list4.Product

import com.example.list4.Store.ProductStatus
/**
 * Abstract class representing a product.
 *
 * @property id The unique identifier of the product.
 * @property name The name of the product.
 * @property price The price of the product.
 * @property status The status of the product.
 */
abstract class Product(
    val id: Int,
    val name: String,
    var price: Double,
    var status: ProductStatus = ProductStatus.AVAILABLE
) {
    abstract fun getDesc(): String
}