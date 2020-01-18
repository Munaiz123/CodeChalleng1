import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;



public class ReadFile{

  public ReadFile(){

  }

  public ArrayList<String> parseString(String fileName)throws IOException{

    ArrayList <String> lines = new ArrayList<String>();

    Path path = Paths.get(fileName);
    Scanner fileText = new Scanner(path);
    while(fileText.hasNextLine()){
      String line = fileText.nextLine();
      // System.out.println(line);
      lines.add(line);

    }
    fileText.close();
    System.out.println(lines);
    return lines;
  }


}
