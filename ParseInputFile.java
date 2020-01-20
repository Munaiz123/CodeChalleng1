import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;


public class ParseInputFile{

  /*
  This method parses each line in the .txt file as an element of an ArrayList.
  The price of each item is abstracted at this point; the returned ArrayList
  will be used to create a "Cart" / "Order".
  */

  public ArrayList<String> parseFile(String fileName)throws IOException{

    ArrayList <String> itemsWithPrice = new ArrayList<String>();

    Path path = Paths.get(fileName);
    Scanner fileText = new Scanner(path);

    while(fileText.hasNextLine()){
      String line = fileText.nextLine();
      String[] subStrings = line.split(" at ");

      itemsWithPrice.addAll(Arrays.asList(subStrings));
    }
    fileText.close();

    return itemsWithPrice;
  }

}
