package com.example.list4.Store

import java.util.Date
import com.example.list4.Users.User
import com.example.list4.Product.Product

data class Purchase(
    val product: Product,
    val buyer: User,
    val quantity: Int,
    val price: Double,
    val date: Date = Date()
)

