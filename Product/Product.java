package Product;

public class Product {

  protected enum Categoory{
    Book, Food, Medical, Other
  }

  String name;
  double price;
  double salesTaxRate;
  double priceAfterTaxes;
  Categoory productType;

  public Product(String productName, double productPrice, Categoory type){
    name = productName;
    price = productPrice;
    productType = type;
    if(productType == Categoory.Other) salesTaxRate = .1;

  }

  public double calcPriceAfterTaxes(){
    priceAfterTaxes= price * salesTaxRate;
    return priceAfterTaxes;
  }

}
