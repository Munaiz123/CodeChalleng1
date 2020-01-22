package Product;

public class Product {

  String name;
  public double price;
  boolean isImported;

  double salesTax;
  double importDuty;

  public double taxRate;


  public Product(String productName, double productPrice, boolean isImported, double salestax){
    name = productName;
    price = productPrice;
    if(isImported == true) this.importDuty = .05;
    else this.importDuty = 0;

    salesTax = salestax;
  }

  public String toString(){
    return "Name: " + name + " - Price: " + price + " - Sales Tax: " + salesTax + " - Import Duty:: " + importDuty;
  }

  public double calcTaxRate(){
    taxRate = 1 + salesTax + importDuty;
    return taxRate;
  }

}
