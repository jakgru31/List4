package com.example.list4.Product

import com.example.list4.Store.ProductStatus
/**
 * Class representing a painting product.
 *
 * @property artist The artist of the painting.
 * @property style The style of the painting.
 * @property year The year the painting was created.
 */
class Painting(
    id: Int,
    name: String,
    price: Double,
    val artist: String,
    val style: String,
    val year: Int,
    status: ProductStatus
) : Product(id, name, price, status) {
    override fun getDesc(): String {
        return "Painting: $name, artist: $artist, style: $style, year: $year, price: $price, status: $status"
    }
}