import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;


public class ParseInputFile{

  // This method parses each line item as an element of an ArrayList + returns the ArrayList.
  public ArrayList<String> parseFile(String fileName)throws IOException{

    ArrayList <String> lines = new ArrayList<String>();

    Path path = Paths.get(fileName);
    Scanner fileText = new Scanner(path);
    while(fileText.hasNextLine()){
      String line = fileText.nextLine();
      lines.add(line);
    }
    fileText.close();
    return lines;
  }

}
