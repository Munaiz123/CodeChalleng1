package Product;

public class Product {

  String name;
  double price;
  double salesTaxRate;
  double priceAfterTaxes;
  String productType;


  public String toString(){
    return "Name: " + name + " Price: " + price + " Type: " + productType;
  }

  public Product(String productName, double productPrice, String type){
    name = productName;
    price = productPrice;
    productType = type;
    if(productType == "other") salesTaxRate = .1;
    else salesTaxRate = 0;

  }

  public double calcPriceAfterTaxes(){
    priceAfterTaxes = price * (1 + salesTaxRate);

    double roundedPrice = Math.round(priceAfterTaxes * 100.0) / 100.0;
    System.out.println("ROUNDEDNUM ::: " + roundedPrice);
    return roundedPrice;
  }

}
