package com.example.list4.Product

import com.example.list4.Store.ProductStatus

class Painting (id: Int, name: String, price: Double, val artist: String, val style: String, val year: Int,
                status: ProductStatus
) : Product(id, name, price, status) {
    override fun getDesc(): String {
        return "Painting: $name, artist: $artist, style: $style, year: $year, price: $price, status: $status"
    }
}