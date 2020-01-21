import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;


public class SalesTaxes {

  public static void main(String[] args) throws IOException{

    //Parsing input commands
    ParseInputFile newFile1 = new ParseInputFile();
    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);

    //Processing (creating an order) input commands
    Order newOrder1 = new Order(parsedFile);
    Hashtable<String, Double> itemsHashTable =  newOrder1.createHashtable(newOrder1.items);
    newOrder1.processItems(itemsHashTable);





  }
}
