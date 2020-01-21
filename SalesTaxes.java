import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import Product.Product;


public class SalesTaxes {

  public static void main(String[] args) throws IOException{

    //Parsing input commands
    ParseInputFile newFile1 = new ParseInputFile();
    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);

    //Processing (creating an order) input commands
    Order newOrder1 = new Order(parsedFile);
    Hashtable<String, Double> itemsHashTable =  newOrder1.createHashtable(newOrder1.items);
    // System.out.println("ITEMS HASHTABLE:: " + itemsHashTable);

    ArrayList<Product> PROCESSEDITEMS = newOrder1.processItems(itemsHashTable);

    // System.out.println("PROCESSEDITEMS:: " + PROCESSEDITEMS );


    for( Product p : PROCESSEDITEMS){
      System.out.println(p.toString());
      // System.out.println(p.name);
    }



  }
}
