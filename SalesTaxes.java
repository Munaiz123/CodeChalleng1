import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class SalesTaxes {

  public SalesTaxes(){

  }

  public String readFile(String fileName){
    return fileName;
  }

  public static void main(String[] args) throws IOException{

    ParseInputFile newFile1 = new ParseInputFile();


    ArrayList <String> parsedFile = newFile1.parseFile(args[0]);
    System.out.println("InputReceipt 1::: "+ parsedFile);

    DecodeInput decodedArray = new DecodeInput();
    decodedArray.splitLineItems(parsedFile);

    // String message = "hello at home";
    // String[] messageArray = message.split("at");
    // System.out.println("MessageARRAY " + Arrays.toString(messageArray));
  }
}
