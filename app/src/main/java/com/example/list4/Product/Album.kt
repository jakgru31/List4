package com.example.list4.Product

import com.example.list4.Store.ProductStatus
/**
 * Class representing an album product.
 *
 * @property artist The artist of the album.
 * @property genre The genre of the album.
 * @property year The year the album was released.
 */
class Album (id: Int, name: String, price: Double, val artist: String, val genre: String, val year: Int,
             status: ProductStatus
) : Product(id, name, price, status) {
    override fun getDesc(): String {
        return "Album: $name, artist: $artist, genre: $genre, year: $year, price: $price, status: $status"
    }
}