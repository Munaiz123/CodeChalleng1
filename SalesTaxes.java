import java.io.IOException;
import java.util.ArrayList;


public class SalesTaxes {

  public static void main(String[] args) throws IOException{

    ParseInputFile newFile1 = new ParseInputFile();

    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);

    Order newOrder1 = new Order(parsedFile);
    for(int i = 0; i < newOrder1.items.size(); i++){

    }
  }
}
