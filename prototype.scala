package structural

/**
  * Created by osboxes on 15/04/17.
  */
class ClonableProduct {

  override def clone(): ClonableProduct = {
    super.clone().asInstanceOf[ClonableProduct]
  }
}

class ProductPrototype(name:String,price:String) extends ClonableProduct {

  override def clone(): ClonableProduct = {
    super.clone();
  }
}