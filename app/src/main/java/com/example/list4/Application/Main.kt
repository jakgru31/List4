package com.example.list4.Application
import com.example.list4.Product.*
import com.example.list4.Users.*
import com.example.list4.Store.*

fun main() {
    val user = Customer(1, "JohnDoe")
    val product1 = Book(1, "Kotlin", 10.0, "Joshua Bloch", "Tutorial, Programming", "Oracle", ProductStatus.AVAILABLE)
    val product2 = Painting(2, "Mona Lisa", 1000000.0, "Leonardo da Vinci", "Renaissance", 1503, ProductStatus.AVAILABLE)
    println(product1.getDesc())
    println(product2.getDesc())

    val purchase = Purchase(product1, user, 1, product1.price)
    println(purchase)
    println(user.purchase(product1, 1))
    println(user.cancel(product1))
    println(user.purchase(product1, 1))
    println(user.cancel(product1))

}