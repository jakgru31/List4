package com.example.list4.Users
import com.example.list4.Store.Store
import com.example.list4.Store.ProductStatus
import com.example.list4.Product.Product

class Admin(userID: Int, username: String): User(userID, username) {
    override fun getUserRole(): String {
        return "Admin $username"
    }

    override fun purchase(product: Product, quantity: Int): String {
        return "Admins cannot purchase"
    }

    override fun cancel(product: Product): String {
        return "Admins cannot cancel"
    }
    fun addProduct(store: Store, product: Product) {
        store.addProduct(product)
    }
    fun updatePrice(product: Product, price: Double) {
        product.price = price
    }
    fun updateStatus(product: Product, status: ProductStatus) {
        product.status = status
    }
    fun removeProduct(store: Store, product: Product) {
        store.removeProduct(product.id)
    }

}