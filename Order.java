import java.util.ArrayList;
import java.util.Hashtable;

import Product.ImportedProduct;
import Product.Product;


public class Order{
  ArrayList<String> items;
  ArrayList<Product> processedItems = new ArrayList<Product>();

  double subTotal;
  double tax;
  double total;

  protected enum Categoory{
    Book, Food, Medical, Other
  }

  public Order(ArrayList<String> itemsArray){
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

  public ArrayList<Product> processItems(Hashtable<String, Double> itemsHashtable){
    /* This method places Product & ImportedProducts objects into an ArrayList,
    which later will be looped through to calculate totals,
    by iterating through the Hashtable. */

    for(String key : itemsHashtable.keySet()){
      String productType;
      if(key.contains("book")) productType = "book";
      else if (key.contains("chocolate")) productType = "food";
      else if (key.contains("pill")) productType = "medical";
      else productType = "other";

      if(key.contains("imported")){
        ImportedProduct item = new ImportedProduct(key, itemsHashtable.get(key), productType);
        processedItems.add(item);
      } else {
        Product item = new Product(key, itemsHashtable.get(key), productType);
        processedItems.add(item);
        // System.out.println("SYSTEMOUTPRINT:: " + item.toString());

      }

    }

    return processedItems;
  }

  public double processOrder(){
    // I would like this method to loop through the productArray(array of objects) and calculate the tax, subtotal & total.

    return total;
  }

}
