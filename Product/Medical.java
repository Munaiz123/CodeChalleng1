package Product;

import java.util.ArrayList;

public class Medical extends Product{

  ArrayList<String> ingrediants = new ArrayList<String>();

  public Medical(String name, double price, boolean isImported, double salesTax){
    super(name, price, isImported, salesTax);
  }

}
