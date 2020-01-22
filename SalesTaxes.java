import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import Product.Product;


public class SalesTaxes {

  public static void main(String[] args) throws IOException{

    //Parsing input commands
    ParseInputFile newFile1 = new ParseInputFile();
    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);

    //Processing (creating creating object instances) input commands
    Order newOrder1 = new Order(parsedFile);
    Hashtable<String, Double> itemsHashTable =  newOrder1.createHashtable(newOrder1.items);
    newOrder1.processItems(itemsHashTable);
    newOrder1.calcProductTaxRates();



  }
}
