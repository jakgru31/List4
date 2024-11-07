package com.example.list4.Product

import com.example.list4.Store.ProductStatus

abstract class Product(
    val id: Int,
    val name: String,
    var price: Double,
    var status: ProductStatus = ProductStatus.AVAILABLE)
{
    abstract fun getDesc(): String
}

