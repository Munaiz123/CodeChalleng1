import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;


public class ParseInputFile{

  // This method parses each line item as an element of an ArrayList + returns the ArrayList.

  public ArrayList<String> parseFile(String fileName)throws IOException{

    ArrayList <String> itemsWithoutPrice = new ArrayList<String>();

    Path path = Paths.get(fileName);
    Scanner fileText = new Scanner(path);

    while(fileText.hasNextLine()){
      String line = fileText.nextLine();
      String[] subStrings = line.split(" at ");
      itemsWithoutPrice.addAll(Arrays.asList(subStrings[0]));
    }
    fileText.close();

    return itemsWithoutPrice;
  }

}
