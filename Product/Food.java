package Product;

import java.util.ArrayList;

public class Food extends Product{
  double taxRate;
  double importDuty;

  ArrayList<String> ingrediants = new ArrayList<String>();

  public Food(String name, double price, boolean isImported, double salesTax){
    super(name, price, isImported, salesTax);
    if(isImported == true) this.importDuty = .05;
    else this.importDuty = 0;
  }

  @Override
  public double calcTaxRate(){
    this.taxRate = 1 + importDuty;
    return taxRate;
  }

  private void addIngredient(String ingredient){
    this.ingrediants.add(ingredient);
  }

}
