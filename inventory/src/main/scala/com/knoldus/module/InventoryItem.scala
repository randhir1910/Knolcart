package com.knoldus.module

import com.knoldus.Const.Constant

case class Products(itemName: String, description: String, vendor: String, price: Double, rating: Double, quantity: Int) {

  def updateQuantity(operation: String): Unit = {
    operation match {
      case "increase" => Products(itemName, description, vendor, price, rating, quantity + 1)
      case "decrease" => Products(itemName, description, vendor, price, rating, quantity - 1)
      case _ => Products(itemName, description, vendor, price, rating, quantity)
    }
  }
}

class ProductItem extends Inventory {

  val itemDb: List[Products] = getAllItem

  override def getAllItem: List[Products] = List(Constant.item1, Constant.item2, Constant.item3, Constant.item4)

  override def search(itemName: String): List[Products] = {

    itemDb.filter(item => item.itemName == itemName)
  }

  override def priceHighToLow(): List[Products] = {

    itemDb.sortWith((temp, real) => temp.price > real.price)
  }

  override def filterByLowToHighPrice(): List[Products] = {

    itemDb.sortWith((temp, real) => temp.price < real.price)

  }

  override def filterByHighToLowRating(): List[Products] = {

    itemDb.sortWith((temp, real) => temp.rating > real.rating)

  }

  override def filterByLowToHighRating(): List[Products] = {

    itemDb.sortWith((temp, real) => temp.rating < real.rating)
  }
}
