package com.example.list4.Store
import com.example.list4.Product.Product
import com.example.list4.Users.User
class Store {
    private val products = mutableListOf<Product>()
    private val users = mutableListOf<User>()
    private val orders = mutableListOf<Purchase>()

    /**
     * Adds a product to the store.
     * @param product The product to be added.
     */
    fun addProduct(product: Product) {
        products.add(product)
    }

    /**
     * Updates the price of a product.
     * @param productID The ID of the product.
     * @param newPrice The new price to be set.
     */
    fun updatePrice(productID: Int, newPrice: Double) {
        products.find {
            it.id == productID
        }?.let {
            it.price = newPrice
        } ?: println("Product not found")
    }

    /**
     * Updates the status of a product.
     * @param productID The ID of the product.
     * @param newStatus The new status to be set.
     */
    fun updateStatus(productID: Int, newStatus: ProductStatus) {
        products.find {
            it.id == productID
        }?.let {
            it.status = newStatus
        } ?: println("Product not found")
    }

    /**
     * Removes a product from the store.
     * @param productID The ID of the product to be removed.
     */
    fun removeProduct(productID: Int) {
        products.find {
            it.id == productID
        }?.let {
            products.remove(it)
        } ?: println("Product not found")
    }

    /**
     * Adds a user to the store.
     * @param user The user to be added.
     */
    fun addUser(user: User) {
        users.add(user)
    }

    /**
     * Removes a user from the store.
     * @param userID The ID of the user to be removed.
     */
    fun removeUser(userID: Int) {
        users.find {
            it.userID == userID
        }?.let {
            users.remove(it)
        } ?: println("User not found")
    }

    /**
     * Lists all products in the store.
     */
    fun listProducts() {
        products.forEach {
            println(it.getDesc())
        }
    }

    /**
     * Lists all users in the store.
     */
    fun listUsers() {
        users.forEach {
            println(it.getUserRole())
        }
    }

    /**
     * Adds an order to the store.
     * @param purchase The purchase order to be added.
     */
    fun addOrder(purchase: Purchase) {
        orders.add(purchase)
    }

    /**
     * Lists all orders in the store.
     */
    fun listOrders() {
        orders.forEach {
            println("Order: ${it.product.name}, quantity: ${it.quantity}, user: ${it.buyer.username}, date: ${it.date}")
        }
    }
}