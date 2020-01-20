package Product;

public class Product {
  String name;
  double price;
  double salesTax;
  boolean isImported = false;

  public Product(String productName, double productPrice){
    name = productName;
    price = productPrice;
  }

}
