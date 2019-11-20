package classes

/**
 * Properties in Kotlin classes can be declared either as mutable using the var keyword,
 * or as read-only using the val keyword.
 *
 * property syntax:
 * var property name: Data Type = initializer
 *  getter
 *  setter
 */

class Address(
    var name: String = "Sherlok Homes",
    var street: String = "",
    var city: String = "")

/**
 * As we know sometime we need custom method to perform the business logic. Kotlin says that as field
 * compile time constant will be declared using const keyword.
 */