import java.util.ArrayList;
import Product.Product;

public class Receipt{
  ArrayList <Product> allItems;

  public Receipt(ArrayList<Product> processedItemArray){
    allItems = processedItemArray;
  }

  public void printReceipt(){  //part of processing not PRESENTING OUTPUT.
    for(Product item : allItems){
      item.calcFinalPrice();
      System.out.println(item.getFinalPrice());
    }
  }


}
