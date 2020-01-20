import java.util.ArrayList;

public class Order{
  ArrayList<String> items;
  int numberOfItems;
  double subTotal;
  double tax;
  double total;


  public Order(ArrayList<String> itemsArray){
    items = itemsArray;
    numberOfItems = itemsArray.size();
  }

}
