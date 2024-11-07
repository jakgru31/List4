package com.example.list4.Product

import com.example.list4.Store.ProductStatus

class Book(id: Int, name: String, price: Double, val author: String, val genre: String, val publisher: String,
           status: ProductStatus
) : Product(id, name, price, status) {
    override fun getDesc(): String {
        return "Book: $name, author: $author, genre: $genre, publisher: $publisher, price: $price, status: $status"
    }
}