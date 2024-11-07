package com.example.list4.Users
import com.example.list4.Product.Product
import com.example.list4.Store.ProductStatus
class Customer(userID: Int, username: String): User(userID, username) {
    override fun getUserRole(): String {

        return "Customer $username"
    }

    override fun purchase(product: Product, quantity: Int): String {
        if (product.status == ProductStatus.OUT_OF_STOCK) {
            return "Product ${product.name} is out of stock"
        }
        else if (product.status == ProductStatus.DISCONTINUED) {
            return "Product ${product.name} is discontinued"
        }
        else return "Customer $username purchased $quantity ${product.name}"
    }

    override fun cancel(product: Product): String {
        return "Customer $username canceled order of ${product.name}"
    }
}