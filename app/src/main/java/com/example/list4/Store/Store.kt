package com.example.list4.Store
import com.example.list4.Product.Product
import com.example.list4.Users.User
class Store {
    private val products = mutableListOf<Product>()
    private val users = mutableListOf<User>()
    private val orders = mutableListOf<Purchase>()

    fun addProduct(product: Product) {
        products.add(product)
    }
    fun updatePrice(productID: Int, newPrice: Double){
        products.find{
            it.id == productID
        }?.let{
            it.price = newPrice
        } ?: println("Product not found")
    }
    fun updateStatus(productID: Int, newStatus: ProductStatus){
        products.find{
            it.id == productID
        }?.let{
            it.status = newStatus
        } ?: println("Product not found")
    }
    fun removeProduct(productID: Int){
        products.find{
            it.id == productID
        }?.let{
            products.remove(it)
        } ?: println("Product not found")
    }
    fun addUser(user: User) {
        users.add(user)
    }
    fun removeUser(userID: Int) {
        users.find{
            it.userID == userID
        }?.let{
            users.remove(it)
        } ?: println("User not found")
    }

    fun listProducts() {
        products.forEach {
            println(it.getDesc())
        }
    }
    fun listUsers() {
        users.forEach {
            println(it.getUserRole())
        }
    }

    fun addOrder(purchase: Purchase) {
        orders.add(purchase)
    }

    fun listOrders() {
        orders.forEach {
            println("Order: ${it.product.name}, quantity: ${it.quantity}, user: ${it.buyer.username}, date: ${it.date}")
    }

    }

}