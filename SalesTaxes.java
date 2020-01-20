import java.io.IOException;
import java.util.ArrayList;


public class SalesTaxes {

  public SalesTaxes(){

  }

  public String readFile(String fileName){
    return fileName;
  }

  public static void main(String[] args) throws IOException{

    ParseInputFile newFile1 = new ParseInputFile();

    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);

    Order newOrder1 = new Order(parsedFile);
    System.out.println("ORDER1 Items " + newOrder1.items);
  }
}
