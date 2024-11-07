package com.example.list4.Store

import java.util.Date
import com.example.list4.Users.User
import com.example.list4.Product.Product

/**
 * Data class representing a purchase in the system.
 *
 * @property product The product being purchased.
 * @property buyer The user who is buying the product.
 * @property quantity The quantity of the product being purchased.
 * @property price The price of the product at the time of purchase.
 * @property date The date when the purchase was made.
 */
data class Purchase(
    val product: Product,
    val buyer: User,
    val quantity: Int,
    val price: Double,
    val date: Date = Date()
)
