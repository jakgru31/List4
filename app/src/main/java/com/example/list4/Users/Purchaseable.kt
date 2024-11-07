package com.example.list4.Users
import com.example.list4.Product.Product

interface Purchaseable {
    fun purchase(product: Product, quantity: Int): String
    fun cancel(product: Product): String
}