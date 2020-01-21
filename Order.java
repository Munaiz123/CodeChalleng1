import java.util.ArrayList;
import java.util.Hashtable;
import Product.Product;


public class Order{
  ArrayList<String> items;
  ArrayList<Product> processedItems;

  double subTotal;
  double tax;
  double total;

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
      System.out.println("KEY:: " + key + " --- VALUE:: " + itemsHashtable.get(key));
    }

    // may need switch statement here 🤔


    return processedItems;
  }

  public double processOrder(){
    // I would like this method to loop through the productArray(array of objects) and calculate the tax, subtotal & total.

    return total;
  }

}
