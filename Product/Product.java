package Product;

public class Product {

  String name;
  boolean isImported;

  double salesTax;
  double importDuty;

  public double price;
  public double taxRate;


  /*                CONSTRUCTOR METHODS FOR THE BASE PRODUCT CLASS                    */
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


 /*This method will be overridden as subclasses will have
 a slightly different way of calculating the tax rate. */
  public double calcTaxRate(){
    taxRate = 1 + salesTax + importDuty;
    return taxRate;
  }

}
