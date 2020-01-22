package Product;

import java.util.ArrayList;

public class Food extends Product{
  double salesTax = 0;

  ArrayList<String> ingrediants = new ArrayList<String>();

  public Food(String name, double price, boolean isImported){
    super(name, price, isImported);

  }

  private void addIngredient(String ingredient){
    this.ingrediants.add(ingredient);
  }


}
