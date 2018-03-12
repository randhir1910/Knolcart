package com.knoldus.module

trait Inventory {

  def getAllItem: List[Products]

  def search(itemName: String): List[Products]

  def filterByLowToHighPrice(): List[Products]

  def priceHighToLow(): List[Products]

  def filterByLowToHighRating(): List[Products]

  def filterByHighToLowRating(): List[Products]


}
