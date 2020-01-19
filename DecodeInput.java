import java.util.ArrayList;
import java.util.Arrays;


public class DecodeInput{

  public ArrayList<String> splitLineItems(ArrayList<String> arrayOfLineItems){

    ArrayList <String> decodedLineItems = new ArrayList<String>();
    for(String line : arrayOfLineItems){
      String[] subStrings = line.split(" at ");
      System.out.println(Arrays.toString(subStrings));
    }
    return decodedLineItems;
  }
}
