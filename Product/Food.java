package Product;

import java.util.ArrayList;

public class Food extends Product{

  ArrayList<String> ingrediants = new ArrayList<String>();

  public Food(String name, double price, boolean isImported, double salesTax){
    super(name, price, isImported, salesTax);

  }

  private void addIngredient(String ingredient){
    this.ingrediants.add(ingredient);
  }


}
