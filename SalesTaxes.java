import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

public class SalesTaxes {

  public static void main(String[] args) throws IOException{

    /*PARSING INPUT COMMANDS */

    ParseInputFile newFile1 = new ParseInputFile();
    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);


    /* PROCESSING INPUT COMMANDS (CREATING AN ORDER INSTANCE) */

    Order newOrder1 = new Order(parsedFile);
    Hashtable<String, Double> itemsHashTable =  newOrder1.createHashtable(newOrder1.items);
    newOrder1.processItems(itemsHashTable);
    newOrder1.calcProductTaxRates();
    newOrder1.calcTotal();
    newOrder1.calcTaxes();


    System.out.println(newOrder1.getTotal());
    System.out.println(newOrder1.getTax());

  }
}
