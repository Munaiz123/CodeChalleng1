package Product;

import java.util.ArrayList;

public class Medical extends Product{
  double salesTax = 0;

  ArrayList<String> ingrediants = new ArrayList<String>();

  public Medical(String name, double price, boolean isImported){
    super(name, price, isImported);

  }


}
