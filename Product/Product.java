package Product;

public class Product {

  String name;
  double price;
  boolean isImported;

  double salesTax;
  double importDuty;
  double taxRate;



  public Product(String productName, double productPrice, boolean isImported, double salestax){
    name = productName;
    price = productPrice;
    if(isImported == true) importDuty = .05;
    else importDuty = 0;
    salesTax = salestax;
  }

  public String toString(){
    return "Name: " + name + " - Price: " + price + " - Sales Tax: " + salesTax + " - Import Duty:: " + importDuty;
  }



}
