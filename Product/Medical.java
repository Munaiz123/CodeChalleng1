package Product;

import java.util.ArrayList;

public class Medical extends Product{
  double taxRate;
  double importDuty;

  ArrayList<String> ingrediants = new ArrayList<String>();

  public Medical(String name, double price, boolean isImported, double salesTax){
    super(name, price, isImported, salesTax);
    if(isImported == true) this.importDuty = .05;
    else this.importDuty = 0;

  }

  @Override
  public double calcTaxRate(){
    this.taxRate = 1 + this.importDuty;
    return taxRate;
  }
}
