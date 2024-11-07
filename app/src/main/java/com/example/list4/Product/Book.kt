package com.example.list4.Product

import com.example.list4.Store.ProductStatus
/**
 * Class representing a book product.
 *
 * @property author The author of the book.
 * @property genre The genre of the book.
 * @property publisher The publisher of the book.
 */
class Book(id: Int, name: String, price: Double, val author: String, val genre: String, val publisher: String,
           status: ProductStatus
) : Product(id, name, price, status) {
    override fun getDesc(): String {
        return "Book: $name, author: $author, genre: $genre, publisher: $publisher, price: $price, status: $status"
    }
}