package edu.knoldus.model

case class UserInformation(name: String, username: String, Address: String, phone: String, password: String)

class UserData extends user {

  val user: List[UserInformation] = List(
    UserInformation("Randhir", "randhir1910", "e75 noida sec 15", "9953188803", "12345"),

  )

  override def addUser(newUser: UserInformation): List[UserInformation] = {

    if (!user.exists(userData => userData.phone == newUser.phone || userData.username == newUser.username)) {

      user ++ List(newUser)
    }
    else {
      user
    }
  }

  override def loginUser(username: String, password: String): Boolean = {

    if (Nil != user.filter(user => user.username == username && user.password == password)) {
      true
    }
    else {
      false
    }

  }

  override def getAllUser(): List[UserInformation] = {
    user
  }
}
