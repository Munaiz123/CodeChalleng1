import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import Product.Product;


public class SalesTaxes {

  public static void main(String[] args) throws IOException{

    /*PARSING INPUT */
    ParseInputFile newFile1 = new ParseInputFile();
    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);


    /* PROCESSING INPUT (CREATING AN ORDER INSTANCE) */
    Order newOrder1 = new Order(parsedFile);
    Hashtable<String, Double> itemsHashTable =  newOrder1.createHashtable(newOrder1.items);

    ArrayList<Product> processedItems =  newOrder1.processItems(itemsHashTable);
    newOrder1.calcProductTaxRates();
    newOrder1.calcOrderTotal();
    newOrder1.calcOrderTaxes();


    /* PRESENTING OUTPUT  */
    Receipt newReceipt1 = new Receipt(processedItems);
    newReceipt1.printReceipt();

    System.out.println("Sales Tax: " + newOrder1.getOrderTax());
    System.out.println("Total: " + newOrder1.getOrderTotal());
  }
}
