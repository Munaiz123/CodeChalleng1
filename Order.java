import java.util.ArrayList;


public class Order{
  ArrayList<String> items;
  ArrayList<Order> itemsArray = new ArrayList<Order>();


  double subTotal;
  double tax;
  double total;

  public Order(ArrayList<String> itemsArray){
    items = itemsArray;
  }

  public double processOrder(){
    // I would like this method to loop through the productArray(array of objects) and calculate the tax, subotal & total.

    return total;
  }

}
