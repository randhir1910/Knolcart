package edu.knoldus.module

import com.knoldus.module.{ProductItem, Products}
import org.scalatest.FunSuite

class ProductItemTest extends FunSuite {

  val item = new ProductItem

  val itemCollection1: List[Products] = List(
    Products("Mobile", "one plus 5T", "OnePlus india", 33000, 4.1, 6),
    Products("Mobile", "galaxy s8", " Samsung india", 53000, 4.2, 6),
    Products("Mobile", "Pixel 2", "Google india", 65000, 4.3, 6),
    Products("Mobile", "iphone x", "Apple India", 89000, 4.4, 6))

  val itemCollection2 = List(
    Products("Mobile", "iphone x", "Apple India", 89000, 4.4, 6),
    Products("Mobile", "Pixel 2", "Google india", 65000, 4.3, 6),
    Products("Mobile", "galaxy s8", " Samsung india", 53000, 4.2, 6),
    Products("Mobile", "one plus 5T", "OnePlus india", 33000, 4.1, 6)
  )

  test("search item on collection ") {
    assert(item.search("Mobile") == itemCollection1)
  }

  test("view item on the basis of low to High price ") {
    assert(item.filterByLowToHighPrice() == itemCollection1)
  }

  test("view item on the basis of High to Low price ") {
    assert(item.priceHighToLow() == itemCollection2)
  }

  test("view item on the basis of Low to High Rating ") {
    assert(item.filterByLowToHighRating() == itemCollection1)
  }

  test("view item on the basis of High To Low  Rating ") {
    assert(item.filterByHighToLowRating() == itemCollection2)
  }

}
