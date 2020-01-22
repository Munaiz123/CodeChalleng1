import java.util.ArrayList;
import java.util.Hashtable;

import Product.Book;
import Product.Food;
import Product.Medical;
import Product.Product;


public class Order{
  ArrayList<String> items;
  ArrayList<Product> processedItems = new ArrayList<Product>();

  double subTotal;
  double tax;
  double total;
  boolean isImported;

  public Order(ArrayList<String> itemsArray){ // Constructor Method
    items = itemsArray;
  }


  public Hashtable<String,Double> createHashtable(ArrayList<String> itemsArray){

    Hashtable<String, Double> allItemsHash = new Hashtable<String, Double>();

    for(int i = 0; i < this.items.size(); i++){
      String element = this.items.get(i);
      double elementPrice = Double.parseDouble(this.items.get(i + 1));
      allItemsHash.put(element, elementPrice);
      i++;
    }
    return allItemsHash;
  }



  public ArrayList<Product> processItems(Hashtable <String, Double> itemsHashtable){
    /* This method places the different Product objects into an ArrayList, which later will be looped through to calculate totals, by iterating through the Hashtable. */

    for(String key : itemsHashtable.keySet()){

      if(key.contains("imported")) isImported = true;
      if(key.indexOf("imported") == -1) isImported = false;


      if(key.contains("book")){
        Book item = new Book(key, itemsHashtable.get(key), isImported, 0);
        processedItems.add(item);
      }
      else if (key.contains("chocolate")){
        Food item = new Food(key, itemsHashtable.get(key), isImported, 0);
        processedItems.add(item);
      }
      else if (key.contains("pill")){
        Medical item = new Medical(key, itemsHashtable.get(key), isImported, 0);
        processedItems.add(item);
      }
      else{
        Product item = new Product(key, itemsHashtable.get(key), isImported, .1);
        processedItems.add(item);
      }

    }
    return processedItems;
  }



  public void calcProductTaxRates(){
    for( Product p : processedItems){
      System.out.println(p);
      p.taxRate = Math.round(p.calcTaxRate() * 100.0) / 100.0;
      // System.out.println(p.taxRate);
    }

  }

  /* DEFINED A FEW GETTER & SETTER (CALC) METHODS TO PRACTICE ENCAPSULATION */

  public double getTotal(){
    return this.total;
  }

  public double getTax(){
    return this.tax;
  }

  public double getSubtotal(){
    return this.subTotal;
  }


  protected void calcTotal(){
    for( Product p : processedItems){
      total +=  Math.round((p.taxRate * p.price) * 100.0) / 100.0;
    }
  }

  protected void calcTaxes(){
    for(Product p : processedItems){
      subTotal += p.price;
    }
    tax = Math.round((total - subTotal) * 100.0) / 100.0;
  }

}
